package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int a = 1;
        int b = 2;
        calc.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println(a);
        System.out.println(b);
    }
}
