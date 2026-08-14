package academy.devdojo.maratonajava.exercicios.academia.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double IMC;
    private String status;
    private int notas[];

    public Aluno(String nome, int idade, double peso, double altura, String status, int notas) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.status = status;
        this.notas = new int[]{notas};
    }

    public Aluno() {
        System.out.println("Mais um aluno satisfeito!!!");
    }

    public double calculoIMC() {
        IMC = this.peso / Math.pow(this.altura, 2);
        return IMC;
    }

    public double mediaNotas(int ...nota) {
        int soma = 0;
        for (int n : nota) {
            soma += n;
        }
        return (double) soma / nota.length;
    }

    public String calculoIMC(Double IMC) {
        if (IMC < 18.5) {
            return "Abaixo do peso";
        } else if (IMC <= 24.9) {
            return "Peso normal";
        } else if (IMC <= 29.9) {
            return "Sobrepeso";
        } else if (IMC <= 34.9) {
            return "Obesidade Grau I";
        } else if (IMC <= 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

    public void imprimir(){
        System.out.println("---------Aluno-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: " + calculoIMC());
        System.out.println("Status: " + this.status);
        System.out.println("Nota: " + this.notas);
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
        if (idade < 12){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }
}
