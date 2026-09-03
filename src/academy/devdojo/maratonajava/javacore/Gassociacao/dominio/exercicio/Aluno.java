package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Aluno {
        private String nome;
        private int idade;
        private Seminario seminario;

    public Aluno() {

    }

    public Aluno(Seminario seminario) {
        this.seminario = seminario;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void Imprime(){
        System.out.println("---Aluno---");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Seminario: " + (this.seminario != null ? this.seminario.getTitulo() : "não definido"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
