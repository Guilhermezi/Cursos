# 🐧 Linux — Gerenciando Arquivos e Diretórios no Terminal (Curso em Vídeo)

> Aula focada em **organização de pastas e arquivos pelo terminal**, mostrando como as alterações refletem imediatamente no modo gráfico.  
> **Principais comandos:** `cd`, `ls`, `mkdir`, `touch`, `nano`, `cat`, `rm`, `rmdir`  
> **Atalhos:** `TAB`, `.`, `..`  
> **Conceitos-chave:** caminho **absoluto** e **relativo**

---

## 🎯 Objetivo da Aula

- Aprender a **gerenciar pastas e arquivos** usando o terminal  
- Entender a diferença entre **caminho absoluto vs. relativo**  
- Criar diretórios em sequência com `mkdir -p`  
- Criar e editar arquivos (`touch`, `nano`)  
- Apagar arquivos e pastas com segurança (e entender por que `rm` é perigoso)

---

## 🧠 Conceitos Rápidos

### ✅ Comandos são programas executáveis

- A maioria dos comandos são **executáveis do sistema**
- Funcionam em sistemas **Unix-like** (Linux e macOS), com poucas diferenças

### ✅ Ajuda e documentação

#### `--help` — ajuda rápida

```bash
ls --help
````

#### `man` — manual completo

```bash
man ls
```

> 💡 **Dica:** `man` é mais completo, porém mais técnico. Use quando precisar de detalhes.

---

## ⌨️ TAB e Histórico

### TAB (autocompletar)

* Digite o início do nome e pressione `TAB`
* Se houver mais de uma opção, pressione `TAB` **duas vezes** para listar

### Histórico de comandos

* `↑` volta para comandos anteriores
* `↓` avança para comandos mais recentes

---

## 📂 Listagem e Atalhos Úteis

### `ls` — listar conteúdo do diretório atual

```bash
ls
```

### `ls pasta` — listar conteúdo sem entrar na pasta

```bash
ls Linux
```

### Arquivos ocultos (iniciam com `.`)

```bash
ls -a
```

### Atalhos importantes

| Atalho | Significado     |
| ------ | --------------- |
| `.`    | Diretório atual |
| `..`   | Diretório pai   |
| `~`    | Home do usuário |
| `/`    | Raiz do sistema |

---

## 🚶 Navegação com `cd`

### Entrar em uma pasta

```bash
cd Documentos
```

### Voltar um nível

```bash
cd ..
```

### Voltar para a home

```bash
cd ~
```

> ⚠️ **Importante:** no Linux, o **espaço separa argumentos**.
> `cd ..` funciona, mas `cd..` não.

---

## 🏗️ Criando Diretórios

### `mkdir` — criar pasta

```bash
mkdir Cursos
```

### Criar diretórios aninhados

Sem `-p`, ocorre erro se o caminho não existir:

```bash
mkdir Cursos/Hardware/Modulo1
```

Com `-p`, tudo que faltar será criado:

```bash
mkdir -p Cursos/Hardware/Modulo1
```

---

## 🧷 Espaços no Nome: Duas Formas Corretas

### Opção 1 — Escapar espaço com `\`

```bash
mkdir -p Cursos/Curso\ de\ Hardware/Modulo1
```

### Opção 2 — Usar aspas

```bash
mkdir -p "Cursos/Curso de Hardware/Modulo1"
```

---

## 📄 Criando Arquivos

### `touch` — cria arquivo vazio (ou atualiza data)

```bash
touch exercicio.txt
```

Criar arquivo em uma pasta sem entrar nela:

```bash
touch Cursos/Hardware/Modulo1/exercicio.txt
```

---

## ✍️ Editando Arquivos com `nano`

Abrir ou editar arquivo:

```bash
nano exercicio.txt
```

Atalhos principais do `nano`:

* `CTRL + O` → salvar
* `ENTER` → confirmar
* `CTRL + X` → sair

---

## 👀 Visualizando Conteúdo

### `cat` — mostrar conteúdo do arquivo

```bash
cat exercicio.txt
```

---

## 🧭 Caminho Absoluto vs. Relativo

### `pwd` — exibir caminho absoluto

```bash
pwd
```

* **Caminho absoluto:** começa na raiz `/`

  * Ex.: `/home/usuario/Documentos`
* **Caminho relativo:** depende de onde você está

  * Ex.: `Cursos/Hardware/Modulo1`

---

## 🧹 Removendo Arquivos e Pastas (Com Cuidado)

### `rm` — remover arquivo

```bash
rm oi.txt
```

### `rmdir` — remover pasta vazia

```bash
rmdir Linux
```

> Se a pasta não estiver vazia, o comando falha.

---

## ☠️ O Comando Perigoso: `rm -rf`

Remove tudo **sem perguntar**:

```bash
rm -rf Cursos
```

* `-r` → recursivo (entra em pastas)
* `-f` → força a remoção (sem confirmação)

> ⚠️ **Atenção:** não vai para a lixeira.
> Usado incorretamente, pode **destruir o sistema**.

---

## ✅ Remoção com Confirmação (Mais Seguro)

### `rm -i` — pergunta antes de apagar

```bash
rm -i arquivo.txt
```

---

## 🧩 Dica Extra: `alias` (atalho de comando)

Tornar o `rm` mais seguro por padrão:

```bash
alias rm="rm -i"
```

> 🔹 Válido apenas para a **sessão atual**
> 🔹 Para tornar permanente, adicione ao arquivo `~/.bashrc`

---

## 🧪 Fluxo de Treino Recomendado

1. Entrar em `Documentos`
2. Criar a estrutura:

   ```bash
   mkdir -p Cursos/Hardware/Modulo1
   ```
3. Criar um arquivo:

   ```bash
   touch Cursos/Hardware/Modulo1/exercicio.txt
   ```
4. Entrar na pasta e editar:

   ```bash
   cd Cursos/Hardware/Modulo1
   nano exercicio.txt
   ```
5. Ver o conteúdo:

   ```bash
   cat exercicio.txt
   ```
6. Voltar e remover com segurança:

   ```bash
   cd ~/Documentos
   rm -i -r Cursos
   ```

---

## 🔗 Aula de Referência

* [https://youtu.be/kK6eBHSxAgA](https://youtu.be/kK6eBHSxAgA)

