package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio.Seminario;

import java.util.Scanner;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Local local = new Local();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Seminario seminario = new Seminario();


        System.out.println("Digite o titulo do seminário: ");
        String titulo = sc.nextLine();
        seminario.setTitulo(titulo);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        aluno.setNome(nome);

        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        aluno.setIdade(idade);
        sc.nextLine();

        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        professor.setNome(nomeProfessor);

        System.out.println("Digite o especialidade do professor: ");
        String especialidade = sc.nextLine();
        professor.setEspecialidade(especialidade);

        System.out.println("Digite o local endereço do seminário: ");
        String endereco = sc.nextLine();
        local.setEndereco(endereco);

        seminario.setLocal(local);
        seminario.setProfessor(professor);
        seminario.setAluno(new Aluno[]{aluno});
        professor.setSeminarios(new Seminario[]{seminario});
        aluno.setSeminario(seminario);

        seminario.Imprime();
        professor.Imprime();
        aluno.Imprime();
        local.Imprime();

    }
}
