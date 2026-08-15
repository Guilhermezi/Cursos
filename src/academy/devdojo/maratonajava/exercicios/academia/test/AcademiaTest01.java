package academy.devdojo.maratonajava.exercicios.academia.test;

import academy.devdojo.maratonajava.exercicios.academia.dominio.Aluno;
import academy.devdojo.maratonajava.exercicios.academia.dominio.Professor;
import academy.devdojo.maratonajava.exercicios.academia.dominio.Turma;

public class AcademiaTest01 {
    public static void main(String[] args) {
        int[] notas = {8, 9, 5, 6, 7};
        int[] rafaNotas = {2, 1, 5, 4, 3};
        int[] daviNotas = {6, 8, 7, 5, 7};
        String[] DS = {"Araujo", "Markim", "Giulio", "David", "Luis", "Matheus"};
        Aluno aluno = new Aluno("Derik", 17, 42.4, 1.78, 'I', "Ativo", notas);
        Aluno Rafael = new Aluno();
        Aluno David = new Aluno();
        Professor professor = new Professor("Marco", 62, 17.2, "Sabe de tudo", 180);
        Professor renatoCariri = new Professor();
        Turma turma = new Turma('A', "Jump", DS);

        Rafael.setNome("Rafael");
        Rafael.setNotas(rafaNotas);
        Rafael.setIdade(17);
        Rafael.setAltura(1.73);
        Rafael.setPlano('B');
        Rafael.setPeso(50.56);
        Rafael.imprimir();

        David.setNome("David");
        David.setNotas(daviNotas);
        David.setIdade(17);
        David.setAltura(1.76);
        David.setStatus("Ativo");
        David.setPlano('A');
        David.setDesconto(David.getDesconto());
        David.setPeso(50.56);
        David.imprimir();

        aluno.imprimir();
        professor.imprimir();
        turma.imprimir();

        renatoCariri.setNome("Renato");
        renatoCariri.setEspecialidade("Rei da coca");
        renatoCariri.setIdade(90);
        renatoCariri.setPreco(700.50);
        renatoCariri.setQuantidadeAlunos(1000);
        renatoCariri.imprimir();

        turma.matricula();

    }
}
