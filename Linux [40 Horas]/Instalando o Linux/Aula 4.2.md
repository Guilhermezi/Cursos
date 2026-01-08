# 📘 Aula Extra — Pendrive bootável travando + Como recuperar o pendrive (GParted)

> Esse vídeo não é exatamente uma aula do curso, mas é um **extra importante**:  
> ajuda quem teve problema ao criar o pendrive bootável (travando, não reconhecendo, partições “malucas”)  
> e ensina a **voltar o pendrive ao normal** depois.

---

## 🎯 Objetivo
- Resolver travamentos ao criar pendrive bootável
- Aprender ferramentas alternativas (mais simples e confiáveis)
- Recuperar pendrive “quebrado” (partições estranhas / espaço não alocado)
- Fazer tudo **pela interface gráfica** (sem terminal), de forma acessível

---

## 🧰 Ferramentas citadas (criar pendrive bootável)
✅ Opções recomendadas:
- **Balena Etcher** (Windows / Linux / macOS) — muito simples: ISO → USB → Flash
- **Rufus** (Windows) — bem conhecido e confiável
- **Linux Live USB Creator / LiLi** (Windows) — pode funcionar, mas pode estar desatualizado

📌 Observação importante:
Algumas ferramentas (como Etcher) podem criar partições que depois **confundem o Windows**, deixando o pendrive parecendo “estragado”.

---

## 🧠 Parte 1 — Problemas comuns
### ⚠️ Travou na hora de criar o pendrive
Sintomas:
- trava no logo do programa
- fica “parado” por muito tempo
- pendrive não dá boot

Solução:
- testar outra ferramenta (Etcher / Rufus / LiLi)
- garantir pendrive bom (mín. 4 GB)
- conferir ISO correta (64-bit)

---

## 🧠 Parte 2 — Como dar boot pelo pendrive (BIOS/UEFI)
Nem todo PC dá boot automaticamente no USB.

Você pode precisar:
- entrar no **Boot Menu** (ex: F8, F12, ESC… varia)
- ou entrar no **Setup/BIOS** (ex: F2, DEL…)

🔁 Ajuste comum:
- colocar USB como **primeira opção** na ordem de boot
- depois da instalação, voltar o HD/SSD como primeiro

---

## 🧠 Parte 3 — Recuperar o pendrive (voltar ao normal) com GParted
Quando o pendrive vira bootável, o Windows pode mostrar:
- várias partições estranhas
- pouco espaço
- “não alocado”
- e não deixa formatar

✅ Solução recomendada no Linux: **GParted**

---

## ✅ Passo a passo (Linux Mint / Linux em geral)

### 1) Instalar o GParted (via interface gráfica)
No Linux Mint:
- Abrir o **Gerenciador de Pacotes (Synaptic)**
- Pesquisar: `gparted`
- Marcar para instalação → Aplicar

> Em algumas distros ele já vem instalado.

---

### 2) Abrir o GParted e selecionar o pendrive
- Abra o **GParted**
- No canto superior direito, selecione o dispositivo correto (pendrive)

⚠️ Cuidado: selecione o pendrive certo para não apagar o HD/SSD.

---

### 3) Criar nova tabela de partição
- **Device / Dispositivo → Create Partition Table**
- Escolher **GPT** (ou MBR/MSDOS se necessário)
- Aplicar

📌 Dica importante do vídeo:
Depois de criar a tabela, **ejetar o pendrive e inserir novamente**  
(parece bobo, mas evita erro de formatação).

---

### 4) Criar uma nova partição em FAT32
- Clique no espaço “não alocado”
- **New / Nova**
- File system: **FAT32**
- Aplicar alterações (botão ✅)

✅ Resultado:
Pendrive volta a funcionar normalmente (inclusive no Windows).

---

## 🔥 Mini-resumo (1 linha)
Se o pendrive “estragar” após virar bootável, **use GParted no Linux**: recrie a tabela de partição, ejete/coloque de novo e formate em **FAT32**.
