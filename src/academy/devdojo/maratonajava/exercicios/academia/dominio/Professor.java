package academy.devdojo.maratonajava.exercicios.academia.dominio;

public class Professor {
    private String nome;
    private int idade;
    private double preco;
    private double salario;
    private String especialidade;
    private int quantidadeAlunos;

    public Professor(String nome, int idade, double preco, String especialidade, int quantidadeAlunos) {
        this.nome = nome;
        this.idade = idade;
        this.preco = preco;
        this.especialidade = especialidade;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public Professor() {

    }

    public double calculoSalario() {
        this.salario = this.preco * this.quantidadeAlunos;
        return this.salario;
    }

    public void imprimir() {
        System.out.println("---------Professor-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Preco: " + this.preco);
        System.out.println("Salario: " + calculoSalario());
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Quantidade da alunos: " + this.quantidadeAlunos);
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
}
