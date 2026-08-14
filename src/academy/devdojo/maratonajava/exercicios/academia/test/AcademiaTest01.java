package academy.devdojo.maratonajava.exercicios.academia.test;

import academy.devdojo.maratonajava.exercicios.academia.dominio.Aluno;
import academy.devdojo.maratonajava.exercicios.academia.dominio.Professor;
import academy.devdojo.maratonajava.exercicios.academia.dominio.Turma;

public class AcademiaTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Derik", 17, 42.4, 1.78, "Ativo", 'D');
        Professor professor = new Professor("Marco", 62, 17.2, "Sabe de tudo", 180);
        Turma turma = new Turma('A', "Jump");

        aluno.imprimir();
        professor.imprimir();
        turma.imprimir();
    }
}
