
# 🐧 Linux — Referências Globais (Globbing) no Terminal

> Aula dedicada aos **caracteres curingas (globbing)** usados no terminal Linux para **selecionar múltiplos arquivos e diretórios de forma inteligente**, algo essencial para produtividade, concursos e administração do sistema.

---

## 🎯 Objetivo da aula

* Entender o que são **referências globais**
* Aprender a usar:

  * `*` (asterisco)
  * `?` (interrogação)
  * `[ ]` (colchetes)
  * `{ }` (chaves)
* Aplicar esses padrões com comandos como `ls`, `cp`, `mv` e `rm`
* Comparar terminal × interface gráfica de forma prática

---

## 🧠 Conceito-chave: o que é Globbing?

* **Globbing não é um comando**
* É um **recurso do shell (Bash)** para expandir padrões
* Serve para selecionar **vários arquivos/diretórios de uma vez**
* Muito mais rápido que selecionar tudo com mouse em grandes volumes

📌 Funciona **antes** do comando ser executado.

---

## ⭐ Asterisco `*` — qualquer coisa

O `*` substitui **zero ou mais caracteres**.

### Exemplos

Listar todos os arquivos:

```bash
ls *
```

Arquivos que terminam com `.conf`:

```bash
ls *.conf
```

Arquivos que começam com `fire`:

```bash
ls fire*
```

Arquivos que contêm a letra `x` em qualquer posição:

```bash
ls *x*
```

📌 O `*` pode representar **qualquer quantidade de caracteres**.

---

## ❓ Interrogação `?` — exatamente um caractere

O `?` substitui **um único caractere**.

### Exemplos

Arquivos com **exatamente 5 letras**:

```bash
ls ?????
```

Arquivos onde:

* 2ª letra é `a`
* resto pode ser qualquer coisa

```bash
ls ?a*
```

Arquivos com padrão específico:

```bash
ls ??s*
```

📌 Use `?` quando a **posição** do caractere importa.

---

## 🔤 Colchetes `[ ]` — faixa ou grupo de caracteres

Usados para definir **conjuntos ou intervalos**.

### Exemplos

Arquivos que começam com `f` e segunda letra entre `a` e `i`:

```bash
ls f[a-i]*
```

Arquivos que começam com `c`, `d` ou `e`:

```bash
ls [cde]*
```

Intervalos:

```bash
ls [a-z]*
ls [0-9]*
```

📌 O hífen `-` indica **intervalo**
📌 A vírgula separa **opções**

---

## 🔁 Chaves `{ }` — padrões fixos (alternativas)

Usadas para escolher **padrões específicos**, não caracteres individuais.

### Exemplos

Arquivos que terminam com `.pdf` ou `.doc`:

```bash
ls *.{pdf,doc}
```

Arquivos com nomes específicos:

```bash
ls arquivo{1,2,3}.txt
```

Arquivos de aulas:

```bash
ls *Modulo03*
```

📌 Diferente dos colchetes, aqui você define **palavras/padrões completos**.

---

## 📌 Comparação rápida

| Símbolo | Função                            |
| ------- | --------------------------------- |
| `*`     | qualquer quantidade de caracteres |
| `?`     | exatamente 1 caractere            |
| `[a-z]` | intervalo ou grupo                |
| `{a,b}` | padrões fixos                     |

---

## ⚠️ Sensível a maiúsculas e minúsculas

```bash
ls A*
```

≠

```bash
ls a*
```

Linux diferencia **maiúsculas de minúsculas**.

---

## 🧪 Exemplo prático real

Copiar **todos os PDFs** de uma pasta:

```bash
cp *.pdf ~/Documentos/PDFs
```

Mover **todos os arquivos do módulo 03**:

```bash
mv *Modulo03* ~/Cursos
```

Apagar **com cuidado**:

```bash
rm -i *.tmp
```

---

## 🖱️ Terminal × Interface Gráfica

* Poucos arquivos → mouse é mais rápido
* Muitos arquivos (100, 200, 1000+) → terminal é imbatível
* Terminal = **precisão + velocidade**
* Interface gráfica = **conforto visual**

📌 Um não substitui o outro — eles se complementam.

---

## ⚠️ Aviso importante sobre `rm`

```bash
rm -rf *
```

* **Remove tudo**
* Não pede confirmação
* Não vai para a lixeira

✅ Prefira:

```bash
rm -i *
```

Ou treine em:

* máquina virtual
* pasta de testes
* ambiente controlado

---

## 🧠 Conclusão

* Globbing é um dos recursos **mais poderosos do shell**
* Essencial para:

  * concursos
  * administração de sistemas
  * produtividade real
* Não é para usar o tempo todo, mas **quando precisa, salva horas**

---

## 🔗 Aula de referência

* [https://youtu.be/7XQ3Qt7EuWg](https://youtu.be/7XQ3Qt7EuWg)

