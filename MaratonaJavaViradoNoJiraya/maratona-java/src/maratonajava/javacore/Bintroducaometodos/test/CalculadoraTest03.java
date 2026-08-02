package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double result = calc.divideDoisNumeros(5, 0);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros02(20, 0));
        System.out.println("-------------");
        calc.imprimeDivisaoDeDoisNumeros(25,6);
    }
}
