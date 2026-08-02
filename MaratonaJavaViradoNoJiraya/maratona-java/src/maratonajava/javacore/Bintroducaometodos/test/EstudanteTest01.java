package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impresora = new ImpressoraEstudante();

        estudante01.nome = "Fabio";
        estudante01.age = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Giovana";
        estudante02.age = 15;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.age);
        System.out.println(estudante01.sexo);

        impresora.imprime(estudante01);
        impresora.imprime(estudante02);

    }
}
