# 🔌 Linux — Pendrive no Dia a Dia (copiar, formatar, ejetar, lixeira e espaço)

## 🎯 Objetivo da aula

* Mostrar que **pendrive funciona normalmente** entre **Linux / Windows / macOS** (dependendo do formato).
* Ensinar a:

  * **copiar / mover arquivos**
  * **formatar pendrive**
  * **ejetar com segurança**
  * entender o papel da **lixeira no pendrive**
  * liberar espaço **de verdade**

---

# 🧠 Mito comum

> “Se eu usar no Linux, não vai funcionar no Windows.”

✅ Na maioria dos casos, funciona sim.
O que manda é o **sistema de arquivos** (o “formato” do pendrive).

---

# 💾 Sistemas de arquivos: qual escolher?

## ✅ FAT32 (recomendado para pendrive “universal”)

**Vantagens**

* Compatível com praticamente tudo: **Windows, Linux, macOS, TVs, videogames, roteadores, som automotivo**, etc.

**Desvantagem**

* ❌ **Não aceita arquivo maior que 4 GB**.

👉 Use quando o objetivo é **compatibilidade máxima**.

---

## ✅ exFAT (bom para arquivos grandes)

**Vantagens**

* Aceita arquivos maiores que 4GB.
* Geralmente bem compatível hoje em dia.

**Desvantagem**

* Pode ter **compatibilidade menor** com aparelhos antigos (TVs/roteadores/câmeras).

👉 Use se você precisa colocar **filmes grandes** ou arquivos pesados.

---

## ⚠️ NTFS (compatível, mas não “perfeito”)

**Vantagens**

* Excelente no Windows.
* Linux normalmente lê/grava (hoje em dia bem melhor do que antigamente).

**Desvantagens**

* Pode ter **problemas ocasionais** em alguns cenários/dispositivos.
* No macOS, em muitos casos o padrão é **ler**, mas **gravar pode exigir ferramentas** (depende da configuração).

👉 Use se você vive entre Windows/Linux e quer algo mais “Windows-friendly”.

---

## ❌ ext4 (não recomendado para pendrive comum)

**Vantagens**

* Padrão Linux, rápido, estável, com permissões/journaling.

**Desvantagem**

* ❌ Windows/macOS não leem nativamente.
* Muitos dispositivos não reconhecem.

👉 Use **apenas** se o pendrive for “só Linux”.

---

# 📁 Copiar e mover arquivos no Linux (modo gráfico)

## Arrastar arquivos

* **Arrastar normal**: geralmente **copia**
* **Arrastar segurando `Shift`**: **move** (recorta)

📌 Isso pode variar por ambiente gráfico, mas essa é a ideia geral apresentada.

---

# 🧽 Formatando o pendrive (modo gráfico)

Caminho típico:

* Abrir **Gerenciador de arquivos**
* Botão direito no pendrive → **Formatar**
* Escolher:

  * **FAT32** (universal)
  * **exFAT** (arquivos grandes)

📌 Durante a formatação ele pede senha (admin), porque isso mexe no sistema.

---

# ⚠️ Ejetar com segurança (muito importante)

## Por que precisa ejetar?

Pendrive é um dispositivo que pode estar:

* ainda **gravando**
* ainda **sincronizando**
* ainda **finalizando operações internas**

Mesmo quando a “janela de cópia” fecha, ele pode continuar trabalhando.

✅ Ejetar com segurança garante:

* **sincroniza dados**
* **fecha gravação**
* **libera o dispositivo**

📌 Isso vale para **Linux, Windows e macOS**.

---

# 🗑️ “Apaguei e não liberou espaço”: a lixeira do pendrive

Esse é o ponto mais importante da aula:

✅ Quando você apaga pelo modo normal (Delete / mover para lixeira), o arquivo:

* **não some de verdade**
* ele vai para uma **pasta oculta dentro do próprio pendrive**

No Linux, normalmente aparece algo como:

* `.Trash-...`
* ou estrutura similar do sistema de lixeira

📌 Ou seja:
**o espaço só libera de verdade quando você esvazia a lixeira.**

---

## ✅ Como ver a lixeira do pendrive

No gerenciador de arquivos:

* Ativar “**mostrar arquivos ocultos**”

  * Geralmente: `Ctrl + H`

Aí aparece a pasta `.Trash...` com os arquivos “apagados”.

---

## ✅ Dois jeitos de apagar

### 1) Apagar “normal” (vai pra lixeira)

* Aperta `Delete`
* ou botão direito → mover para lixeira

➡️ **não libera espaço imediatamente**

### 2) Apagar de vez (sem lixeira)

* Botão direito → **Excluir**
* ou `Shift + Delete`

➡️ **libera espaço de verdade**, mas:
⚠️ **não dá pra restaurar fácil** (cuidado).

---

# ♻️ “Esvaziar lixeira” apaga tudo (inclusive do pendrive)

A aula mostra que ao esvaziar a lixeira do sistema, ele pode:

* limpar arquivos apagados do PC **e**
* limpar arquivos apagados do pendrive

📌 Moral:
✅ Se quer liberar espaço: **esvazie a lixeira**.

---

# ✅ Checklist rápido (pra não dar ruim)

* ✅ Quer compatibilidade máxima? → **FAT32**
* ✅ Precisa de arquivo > 4GB? → **exFAT**
* ✅ Sempre **ejetar com segurança**
* ✅ Apagou e não liberou espaço? → **esvazie a lixeira**
* ⚠️ `Shift + Delete` apaga direto → use com cuidado

---

# Final do curso