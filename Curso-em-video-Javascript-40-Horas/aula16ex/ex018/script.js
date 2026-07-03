var num = document.getElementById('fnum')
var lista = document.getElementById('flista')
var res = document.getElementById('res')
var valores = []

function isNumero(n){
    if(Number(n) >= 1 && Number(n) <= 100){
        return true
    } else {
        return false
    }
}

function inLista(n, l){
    if(l.indexOf(Number(n)) != -1){
        return true
    } else {
        return false
    }
}

function adicionar(){
    if (isNumero(num.value) && !inLista(num.value, valores)){

    }else {
        alert('Valor inválido ou já encontrado na lista!')
    }

    if(num.value.length == 0 || num.value < 1 || num.value > 100){
        alert('Valor inválido!')
    } else if(valores.indexOf(Number(num.value)) != -1){
        alert('Valor já encontrado na lista!')
    } else {
        valores.push(Number(num.value))
        var item = document.createElement('option')
        item.text = `Valor ${num.value} adicionado.`
        lista.appendChild(item)
        res.innerHTML = ''
    }
    num.value = ''
    num.focus()
}

function finalizar(){
    var res = document.getElementById('res')
    if(valores.length == 0){
        alert('Adicione valores antes de finalizar!')
    } else {
        var total = valores.length
        var maior = valores[0]
        var menor = valores[0]
        var soma = 0
        for(var pos in valores){
            soma += valores[pos]
            if(valores[pos] > maior)
                maior = valores[pos]
            if(valores[pos] < menor)
                menor = valores[pos]
        }
        var media = soma / total
        res.innerHTML = ''
        res.innerHTML += `<p>Ao todo, temos ${total} números cadastrados.</p>`
        res.innerHTML += `<p>O maior valor informado foi ${maior}.</p>`
        res.innerHTML += `<p>O menor valor informado foi ${menor}.</p>`
        res.innerHTML += `<p>Somando todos os valores, temos ${soma}.</p>`
        res.innerHTML += `<p>A média dos valores digitados é ${media}.</p>`
    }
}