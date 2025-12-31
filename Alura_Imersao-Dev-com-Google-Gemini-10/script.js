let dados = [];

async function carregarDados() {
    if (dados.length) return dados;
    const resposta = await fetch("data.json");
    if (!resposta.ok) {
        throw new Error("Nao foi possivel carregar os dados");
    }
    dados = await resposta.json();
    return dados;
}

function filtrarDados() {
    const marca = document.getElementById("marca-select").value.trim().toLowerCase();
    const modelo = document.getElementById("modelo-select").value.trim().toLowerCase();
    const anoSelecionado = document.getElementById("ano-select").value.trim();
    const termo = document.getElementById("termo-input").value.trim().toLowerCase();

    return dados.filter((item) => {
        const tags = Array.isArray(item.tags) ? item.tags.join(" ") : "";
        const haystack = [
            item.marca,
            item.modelo,
            String(item.ano),
            item.descricao,
            tags,
        ]
            .join(" ")
            .toLowerCase();

        const matchMarca = !marca || item.marca.toLowerCase() === marca;
        const matchModelo = !modelo || item.modelo.toLowerCase() === modelo;
        const matchAno = !anoSelecionado || String(item.ano) === anoSelecionado;
        const matchTermo = !termo || haystack.includes(termo);
        return matchMarca && matchModelo && matchAno && matchTermo;
    });
}

function montarCards(lista) {
    const container = document.getElementById("resultados");
    container.innerHTML = "";

    if (!lista.length) {
        container.innerHTML = '<p class="muted">Nenhum resultado encontrado.</p>';
        return;
    }

    const frag = document.createDocumentFragment();

    lista.forEach((item) => {
        const card = document.createElement("article");
        card.className = "car-card";
        card.innerHTML = `
            <header class="car-card__header">
                <div>
                    <p class="car-card__brand">${item.marca}</p>
                    <h2 class="car-card__model">${item.modelo}</h2>
                </div>
                <span class="car-card__year">${item.ano}</span>
            </header>
            <p class="car-card__desc">${item.descricao}</p>
            <a class="car-card__link" href="${item.linkManual}" target="_blank" rel="noreferrer">Ver manual</a>
        `;
        frag.appendChild(card);
    });

    container.appendChild(frag);
}

async function iniciarBusca() {
    try {
        await carregarDados();
        const filtrados = filtrarDados();
        montarCards(filtrados);
    } catch (e) {
        const container = document.getElementById("resultados");
        container.innerHTML = '<p class="muted">Erro ao carregar dados.</p>';
        console.error(e);
    }
}

document.addEventListener("DOMContentLoaded", async () => {
    await carregarDados();
    popularSeletores();
    const container = document.getElementById("resultados");
    container.innerHTML = '<p class="muted">Escolha marca, modelo, ano ou digite um termo e clique em Pesquisar.</p>';

    ["termo-input"].forEach((id) => {
        const el = document.getElementById(id);
        el.addEventListener("keyup", (event) => {
            if (event.key === "Enter") {
                iniciarBusca();
            }
        });
    });
});

function popularSeletores() {
    const marcaSelect = document.getElementById("marca-select");
    const modeloSelect = document.getElementById("modelo-select");
    const anoSelect = document.getElementById("ano-select");

    const marcas = [...new Set(dados.map((d) => d.marca))].sort();
    

    marcas.forEach((m) => {
        const opt = document.createElement("option");
        opt.value = m.toLowerCase();
        opt.textContent = m;
        marcaSelect.appendChild(opt);
    });

    

    atualizarModelos("");
    atualizarAnos("", "");

    marcaSelect.addEventListener("change", () => {
        const marcaAtual = marcaSelect.value;
        atualizarModelos(marcaAtual);
        atualizarAnos(marcaAtual, "");
        iniciarBusca();
    });

    modeloSelect.addEventListener("change", () => {
        const marcaAtual = marcaSelect.value;
        const modeloAtual = modeloSelect.value;
        atualizarAnos(marcaAtual, modeloAtual);
        iniciarBusca();
    });
    anoSelect.addEventListener("change", iniciarBusca);
}

function atualizarModelos(marcaSelecionada) {
    const modeloSelect = document.getElementById("modelo-select");
    modeloSelect.innerHTML = '<option value=\"\">Modelo (todos)</option>';

    const modelos = new Set();
    dados.forEach((d) => {
        if (!marcaSelecionada || d.marca.toLowerCase() === marcaSelecionada) {
            modelos.add(d.modelo);
        }
    });

    [...modelos].sort().forEach((m) => {
        const opt = document.createElement("option");
        opt.value = m.toLowerCase();
        opt.textContent = m;
        modeloSelect.appendChild(opt);
    });

    modeloSelect.value = "";
}

function atualizarAnos(marcaSelecionada, modeloSelecionado) {
    const anoSelect = document.getElementById("ano-select");
    anoSelect.innerHTML = '<option value="">Ano (todos)</option>';

    const anos = new Set();
    dados.forEach((d) => {
        const matchMarca = !marcaSelecionada || d.marca.toLowerCase() === marcaSelecionada;
        const matchModelo = !modeloSelecionado || d.modelo.toLowerCase() === modeloSelecionado;
        if (matchMarca && matchModelo) {
            anos.add(d.ano);
        }
    });

    [...anos].sort((a, b) => b - a).forEach((a) => {
        const opt = document.createElement("option");
        opt.value = String(a);
        opt.textContent = a;
        anoSelect.appendChild(opt);
    });

    anoSelect.value = "";
}

