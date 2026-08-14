package academy.devdojo.maratonajava.exercicios.academia.dominio;

public class Turma {
    private char nome;
    private static int limiteAlunos = 20;
    private String tipo;

    public Turma(char nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("---------Turma-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("--------------------");
    }
}
