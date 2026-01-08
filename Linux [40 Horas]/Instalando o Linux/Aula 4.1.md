# 📘 Aula 04 — Instalação do Linux (USB Boot, Partições, GRUB) + Observações Importantes

> ✅ Contexto: no curso eles instalam **Linux Mint** como “primeiros passos” por ser amigável para quem vem do Windows.  
> 🟢 Eu já utilizo do **Zorin OS 18**, então aqui a ideia é **entender o processo** e **praticar conceitos equivalentes** no meu sistema.

---

## 🎯 Objetivo da aula
- Aprender **como baixar uma distro**, criar **pendrive bootável**, iniciar em **modo Live** e instalar.
- Entender as escolhas da instalação:
  - idioma / teclado / fuso-horário
  - usuário / senha
  - particionamento (**/ /home /swap**)
  - bootloader (**GRUB**)
- Perceber que hoje instalar Linux é **muito mais fácil** do que era antigamente.

---

## 🧠 Conceitos-chave (do jeito certo)

### 1) Live USB (modo “testar sem instalar”)
- O Linux roda **direto do pendrive**, geralmente carregando muita coisa na RAM.
- Serve para:
  - testar hardware (Wi-Fi, vídeo, teclado…)
  - navegar e usar antes de instalar
  - instalar depois com calma

---

### 2) Ferramenta de pendrive bootável
No vídeo eles usam **UNetbootin** (no Windows), mas existem alternativas melhores hoje:
- **Balena Etcher**
- **Ventoy**
- **Rufus** (Windows)
- **GNOME Disks / Discos** (Linux)

✅ Ideia central: **ISO + pendrive formatado → pendrive bootável**

---

### 3) Configuração inicial na instalação
Você escolhe:
- **Idioma**
- **Fuso-horário** (ex: `America/Sao_Paulo`)
- **Layout do teclado** (ex: ABNT2)
- **Usuário + senha**
- Nome da máquina (hostname)

📌 Importante: criar usuário com senha é recomendado (mais seguro).

---

### 4) Partições: o que o instalador faz por você
O instalador geralmente cria automaticamente:

- **`/` (root)** → onde o sistema fica instalado  
- **`/home`** → onde ficam seus arquivos e configs do usuário  
- **`swap`** → “memória de emergência” quando a RAM enche (pode existir como partição ou arquivo)

✅ Sistema de arquivos comum: **ext4**

---

### 5) GRUB (bootloader)
- É o menu de boot que aparece quando você liga o PC.
- Se tiver **dual boot**, ele mostra opções (Linux / Windows).
- Mesmo sem dual boot, ele continua sendo importante para iniciar o sistema.

---

### 6) “Nem tudo no Linux é 100% livre”
Eles comentam que:
- Algumas distros incluem **codecs** e coisas “não totalmente livres” (por praticidade).
- Drivers proprietários (ex: **NVIDIA**) podem ser necessários para ter melhor desempenho.

✅ Resumo honesto:
- Linux pode ser livre, mas o mundo real exige compatibilidade (drivers/codecs).

---
