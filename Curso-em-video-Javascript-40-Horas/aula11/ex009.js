var pais = "EUA"
console.log(`Vivendo em ${pais}`)

if (pais == "Brasil") { // Condição Composta
    console.log(`Você é Brasileiro!`)
} else {
    console.log(`Você é Estrangeiro!`)
}
function calcular() {
            var txtv = document.getElementById('txtvel')
            var res = document.getElementById('res')
            var vel = Number(txtv.value)
            
            res.innerHTML = `<p>Sua velocidade atual é de <strong>${vel}Km/h</strong></p>`
            
            if (vel > 60) {
                res.innerHTML += `<p>Você está <strong>MULTADO</strong> por excesso de velocidade!</p>`
            }
            
            res.innerHTML += `<p>Dirija sempre com cinto de segurança!</p>`
        }