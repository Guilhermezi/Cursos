function verificar() {
    var number = document.getElementById('txtnumber')
    var res = document.getElementById('res')

    if (number.value.length == "") {
        window.alert('Verifique os dados e tente novamente!')
    } else {

        res.innerHTML = 'Contando: <br>'

        let Numt = Number(number.value)

        for (let c = 1; c <= 10; c++) {
            res.innerHTML += `${Numt} x ${c} = ${Numt * c} <br>`
        }
    }
}