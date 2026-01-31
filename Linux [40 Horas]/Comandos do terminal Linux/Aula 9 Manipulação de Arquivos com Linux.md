# 🐧 Linux — Manipulação de Arquivos no Terminal (cat, less, cp, mv, rm)


## 🎯 Pré-requisito (aula anterior)

Antes desta aula, é recomendado conhecer **referências globais (globbing)**:

* `*` asterisco
* `?` interrogação
* `[ ]` colchetes
* `{ }` chaves

Esses curingas facilitam muito na hora de copiar/mover/deletar **vários arquivos de uma vez**.

---

## 🧠 Conceito importante: Entrada/Saída padrão

Todo sistema (incluindo Linux e Windows) trabalha com:

* **Entrada padrão (stdin):** teclado
* **Saída padrão (stdout):** tela

📌 Muitos comandos pegam algo (arquivo/resultado) e **jogam na tela** por padrão.
Mais pra frente entra o assunto de **redirecionamento**, que muda essa saída (ex.: mandar a saída para um arquivo).

---

# 👀 Ver conteúdo de arquivos

## `cat` — mostra o conteúdo na tela

O `cat` lê um arquivo e envia para a **saída padrão** (tela).

```bash
cat arquivo.txt
```

✅ Bom para arquivos pequenos.
⚠️ Para arquivos enormes, ele “despeja” tudo na tela e fica ruim de ler.

---

## `less` — paginador (melhor para arquivos grandes)

O `less` permite ler **página por página**, rolar, buscar dentro do texto e sair facilmente.

```bash
less arquivo.txt
```

### Controles úteis no `less`

* `↑` / `↓` — sobe/desce
* `PageUp` / `PageDown` — rola páginas
* `/palavra` — busca uma palavra
* `n` — próximo resultado da busca
* `N` — resultado anterior da busca
* `q` — sair

📌 O `man` (manual) usa paginador (muitas vezes `less`) por trás.

---

## `tac` — `cat` ao contrário

Mostra o arquivo **de baixo para cima** (última linha primeiro).

```bash
tac arquivo.txt
```

✅ Útil quando você quer ver “o que chegou por último” em logs/listas.

---

# 📁 Onde treinar sem medo (pasta temporária)

A aula recomenda usar um lugar “descartável” para testes:

✅ criar uma pasta tipo:

```bash
mkdir /tmp/faculdade
```

⚠️ **/tmp é temporário**: o sistema pode limpar sozinho.
**Não guarde coisas importantes lá.**

---

# 📄 Criando arquivos e pastas (para o treino)

Criar uma pasta:

```bash
mkdir faculdade
```

Criar um arquivo (ex.: com editor `nano`):

```bash
nano aula_linux.txt
```

---

# 📌 Copiar arquivos: `cp`

Sintaxe:

```bash
cp ORIGEM DESTINO
```

Exemplo: copiar `aula_linux.txt` para a pasta `faculdade`:

```bash
cp aula_linux.txt faculdade/
```

📌 Depois disso, o arquivo existe:

* fora da pasta (original)
* dentro da pasta (cópia)

---

# 🚚 Mover / Renomear: `mv`

O `mv` faz duas coisas:

✅ **Mover** para outra pasta
✅ **Renomear** (mover “no mesmo lugar” com nome diferente)

---

## 1) Mover para outra pasta

```bash
mv aula_linux.txt faculdade/
```

Agora o arquivo **some do lugar original** e fica só no destino.

---

## 2) Renomear arquivo ou pasta

Renomear arquivo:

```bash
mv aula_linux.txt aula_linux_backup.txt
```

Renomear pasta:

```bash
mv temporario temp
```

📌 Não existe um comando separado “renomear”: o `mv` resolve.

---

# 🗑️ Apagar: `rm`

Apagar arquivo:

```bash
rm arquivo.txt
```

⚠️ No terminal, **não vai para lixeira**.
Se apagou errado, recuperar é **difícil**, às vezes impossível.

---

## ✅ Apagar com confirmação: `rm -i`

O sistema pergunta “sim ou não” antes de remover:

```bash
rm -i arquivo.txt
```

---

## ⚠️ Apagar recursivo: `rm -r`

Para apagar **pastas com conteúdo**:

```bash
rm -r pasta/
```

---

## 🚨 O comando mais perigoso: `rm -rf`

* `-r` recursivo (apaga tudo dentro)
* `-f` força (não pergunta)

```bash
rm -rf pasta/
```

⚠️ **Altíssimo risco**.
Um erro de espaço ou caminho pode destruir o sistema.

---

# 🧩 Usando curingas com cp/mv/rm (o poder da aula anterior)

Copiar todos os `.conf` de uma pasta para outra:

```bash
cp /etc/*.conf faculdade/temp/
```

Copiar todos os arquivos com extensão específica:

```bash
cp *.{pdf,doc,jpg} faculdade/temp/
```

📌 Aqui os curingas fazem o trabalho pesado.

---

# 🖱️ Terminal vs Modo gráfico

✅ Modo gráfico é ótimo para:

* mover 1 arquivo
* arrastar e soltar
* copiar com Ctrl+C / Ctrl+V

✅ Terminal é ótimo para:

* manipular dezenas/centenas de arquivos
* agir com precisão
* automatizar padrões (curingas)

📌 A ideia não é “um é melhor sempre”, e sim:
**usar a ferramenta certa para o cenário certo.**

---

# 🧠 Boas práticas que a aula reforça

## ✅ Backup (sempre)

> “Se você tem 1 backup, você não tem nenhum.”

* Tenha pelo menos **2 cópias**
* Em locais diferentes, se possível

---

## ✅ Cuidado ao mover e editar arquivos

Erro muito comum:

* copiar arquivo para o PC
* editar sem perceber que ainda está editando o do pendrive
* depois “perde” alterações

📌 Sempre confira **onde o arquivo está**.

---

# 🔗 Aula de referência

* [https://youtu.be/GEU0tmpjVfM](https://youtu.be/GEU0tmpjVfM)

