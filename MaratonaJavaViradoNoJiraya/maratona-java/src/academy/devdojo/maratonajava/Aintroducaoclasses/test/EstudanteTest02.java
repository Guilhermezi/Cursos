package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Junior";
        System.out.println(estudante.age);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("-------------");

        System.out.println(estudante.age);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
    }
}
