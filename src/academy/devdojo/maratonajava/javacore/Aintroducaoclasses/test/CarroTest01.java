package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro porsche = new Carro();
        Carro bmw = new Carro();

//        porsche = bmw; referencia a objetos

        porsche.nome = "Porsche 911";
        porsche.modelo = "GT3 RS";
        porsche.ano = 2020;

        bmw.nome = "X6";
        bmw.modelo = "Competition";
        bmw.ano = 2026;

        System.out.println("Nome: " + bmw.nome + " modelo: " + bmw.modelo + " ano: " + bmw.ano);
        System.out.println("Nome: " + porsche.nome + " modelo: " + porsche.modelo + " ano: " + porsche.ano);

    }
}
