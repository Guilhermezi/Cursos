package academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro car1 = new Carro("BMW", 280);
        Carro car2 = new Carro("Mercedes", 275);
        Carro car3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 180;

        car1.imprime();
        car2.imprime();
        car3.imprime();
    }
}
