package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calc.subtraiDoisNumeros();

    }
}
