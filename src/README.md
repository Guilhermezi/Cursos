# Cursos — Estudos de Java

Repositório com meus estudos de Java, baseados no curso **Maratona Java** da DevDojo, e meus próprios exercícios práticos.

## Estrutura

```
src/academy/devdojo/maratonajava/
├── introducao/          # Fundamentos da linguagem
└── javacore/            # Orientação a objetos
    ├── Aintroducaoclasses/      # Introdução a classes e objetos
    ├── Bintroducaometodos/      # Métodos, varargs, encapsulamento
    ├── Csobrecargametodos/      # Sobrecarga de métodos
    ├── Dconstrutores/           # Construtores
    ├── Eblocosinicializacao/    # Blocos de inicialização
    └── Fmodificadorestaticos/   # Modificador static
```

## Conteúdo estudado

### introducao
- Tipos primitivos, casting e variáveis
- Operadores (aritméticos, relacionais, lógicos, atribuição)
- Estruturas condicionais (`if/else`, ternário, `switch`)
- Estruturas de repetição (`for`, `while`, `do-while`, `break`, `continue`)
- Arrays e arrays multidimensionais (incluindo irregulares)

### javacore
- Classes e objetos, referências, valores default
- Métodos com/sem parâmetro e retorno, varargs, passagem por valor vs referência
- Encapsulamento com getters/setters e validação
- Sobrecarga de métodos e construtores com encadeamento `this()`
- Blocos de inicialização de instância
- Atributos e métodos estáticos

### exercicios
- `academia/` — projeto prático de revisão: sistema com `Aluno`, `Professor` e `Turma` aplicando todos os conceitos acima.

## Como executar

```bash
# Compilar (a partir da raiz do projeto)
javac -d out $(find src -name "*.java")

# Executar um exemplo (ex.: exercício da academia)
java -cp out academy.devdojo.maratonajava.exercicios.academia.test.AcademiaTest01
```
