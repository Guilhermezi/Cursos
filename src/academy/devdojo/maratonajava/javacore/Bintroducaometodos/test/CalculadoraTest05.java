package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String... args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {1, 2, 3, 5, 6, 8, 9};
        calc.somaArray(numeros);
        calc.somaVarArgs(1, 2, 3, 5, 6, 5, 4, 6, 8);
    }
}
