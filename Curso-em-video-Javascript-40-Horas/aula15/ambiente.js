let num = [4, 5, 8, 9]
num[4] = 6 // Adiciona o número 6 na posição 4 do array
num.push(7) // Adiciona o número 7 no final do array
num.length // Retorna o tamanho do array
num.sort() // Ordena o array em ordem crescente
console.log(num)
console.log(`O vetor tem ${num.length} posições.`)
console.log(`O primeiro valor do vetor é ${num[0]}.`)
let pos = num.indexOf(8) // Retorna a posição do número 8 no array
console.log(`O valor 8 está na posição ${pos}.`)

for (let i = 0; i < num.length; i++) {
    console.log(`A posição ${i} tem o valor ${num[i]}.`)
}

for (let i in num) {
    console.log(`A posição ${i} tem o valor ${num[i]}.`)
}

indexOf(3) // Retorna -1, pois o número 3 não está no array
if (pos == -1) {
    console.log('O valor não foi encontrado!')
} else {
    console.log(`O valor está na posição ${pos}.`)
}