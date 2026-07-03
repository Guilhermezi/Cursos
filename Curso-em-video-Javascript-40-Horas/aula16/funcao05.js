// Recursividade é a técnica de uma função chamar a si mesma, ou seja, uma função recursiva é aquela que se chama dentro de seu próprio código. O processo de recursão é o processo de uma função chamar a si mesma, e isso pode ser útil para resolver problemas que podem ser divididos em subproblemas menores.
function fatorial(n) {
    if (n == 1) {
        return 1
    } else {
        return n * fatorial(n - 1)
    }
}

console.log(fatorial(5))