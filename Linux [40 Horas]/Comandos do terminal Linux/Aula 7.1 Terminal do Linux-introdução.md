````md
# 🐧 Linux — Primeiros Passos no Terminal

Anotações organizadas da aula sobre **comandos básicos do terminal**, baseadas no curso do canal **Curso em Vídeo**.

---

## 🎯 Objetivo da Aula

- Perder o medo do terminal  
- Aprender a navegar pelo sistema de arquivos  
- Listar, criar e editar arquivos e pastas  
- Entender que **terminal e interface gráfica são integrados**

---

## 🖥️ Terminal e Shell (Bash)

- O **terminal** é apenas um *emulador*  
- Por trás dele roda um **interpretador de comandos**, chamado **shell**  
- O shell mais comum no Linux é o **Bash**

⚠️ **Atenção:**  
O Linux executa **exatamente** o que você manda, sem questionar.  
Tenha cuidado especial com comandos de exclusão.

---

## 📂 Sistema de Arquivos no Linux

- No Linux **não existem** unidades como `C:` ou `D:`  
- Tudo começa na **raiz**: `/`
- Dispositivos (pendrive, HD, etc.) são **montados como pastas**
- Regra de ouro:  
  > **“Tudo no Linux é arquivo”** (inclusive processos e hardware)

---

## 📍 Onde eu estou?

### `pwd` (Print Working Directory)

Mostra o **caminho completo** (caminho absoluto) do diretório atual.

```bash
pwd
# Exemplo de saída:
# /home/usuario/Documentos
````

---

## 📁 Listando Arquivos e Pastas

### `ls` — Listagem simples

```bash
ls
```

### `ls -l` — Listagem detalhada

Mostra permissões, dono, grupo, tamanho, data e nome.

```bash
ls -l
```

### `ls -h` — Tamanhos “humanos”

Exibe tamanhos em KB, MB ou GB (geralmente usado com `-l`).

```bash
ls -lh
```

### `ls -a` — Mostrar arquivos ocultos

Arquivos que começam com `.` (ponto) são ocultos por padrão.

```bash
ls -a
```

### 🔥 Combinação poderosa

```bash
ls -lha
```

---

## ⌨️ TAB — Seu melhor amigo

* Autocompleta nomes de arquivos e pastas
* Evita erros de digitação
* **Dica:** pressione `TAB` duas vezes para listar opções semelhantes

---

## 🚶 Navegando entre Diretórios

### `cd` (Change Directory)

* Entrar em uma pasta:

```bash
cd Downloads
```

* Voltar para a pasta Home:

```bash
cd ~
# ou apenas
cd
```

* Voltar um nível:

```bash
cd ..
```

---

## 🔎 Atalhos de Caminho

| Símbolo | Significado               |
| ------- | ------------------------- |
| `~`     | Pasta do usuário (Home)   |
| `.`     | Diretório atual           |
| `..`    | Diretório pai             |
| `/`     | Diretório raiz do sistema |

---

## 🏗️ Criando Pastas e Arquivos

### `mkdir` (Make Directory)

Cria diretórios (é possível criar vários de uma vez):

```bash
mkdir Linux
mkdir Pasta1 Pasta2 Pasta3
```

⚠️ **Nota:**
O Linux é **Case Sensitive**
`Linux` ≠ `linux`

---

### `touch`

Cria um arquivo vazio:

```bash
touch oi.txt
```

---

## ✍️ Editando e Visualizando Arquivos

### `nano`

Editor de texto simples direto no terminal:

```bash
nano oi.txt
```

* Salvar: `CTRL + O` → `ENTER`
* Sair: `CTRL + X`

---

### `cat` (Concatenate)

Exibe todo o conteúdo do arquivo diretamente no terminal:

```bash
cat oi.txt
```

---

## 🕘 Histórico de Comandos

* `↑` (Seta para cima): comandos anteriores
* `↓` (Seta para baixo): comandos seguintes
* O Bash armazena **milhares de comandos** no histórico

---

## ✅ Resumo de Sobrevivência (Cheat Sheet)

| Comando         | Descrição                |
| --------------- | ------------------------ |
| `pwd`           | Onde eu estou            |
| `ls`            | Listar arquivos          |
| `ls -lha`       | Listar tudo com detalhes |
| `cd NomePasta`  | Entrar na pasta          |
| `cd ..`         | Voltar um nível          |
| `mkdir Nome`    | Criar pasta              |
| `touch arq.txt` | Criar arquivo vazio      |
| `nano arq.txt`  | Editar arquivo           |
| `cat arq.txt`   | Ler arquivo no terminal  |
| `clear`         | Limpar a tela            |

---

## 🔗 Referência

* **Vídeo:** Primeiros passos no terminal Linux — Curso em Vídeo
* **Professor:** Gustavo Guanabara

