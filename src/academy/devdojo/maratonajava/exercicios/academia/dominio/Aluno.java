package academy.devdojo.maratonajava.exercicios.academia.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double IMC;
    private String status;
    private char plano;
    private double desconto;
    private int[] notas;

    public Aluno(String nome, int idade, double peso, double altura, char plano, String status, int[] notas) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.plano = plano;
        this.status = status;
        this.notas = notas;
    }

    public Aluno() {
    }

    public double calculoIMC() {
        IMC = this.peso / Math.pow(this.altura, 2);
        return IMC;
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

    public double mediaNotas() {
        double soma = 0;
        if(notas.length > 0){
            for (int nota : notas) {
                soma += nota;
            }
        }else {
            return 0;
        }
        return soma / notas.length;
    }

    public void imprimir() {
        System.out.println("---------Aluno-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Plano: " + this.plano);
        System.out.println("Desconto: " + getDesconto());
        System.out.println("IMC: " + calculoIMC());
        System.out.println("Status IMC: " + calculoIMC(this.IMC));
        System.out.println("Status: " + this.status);
        for (int nota : this.notas) {
            if (nota == 0) {
                System.out.println("Você não merece processamento");
                break;
            }
            if (nota < 5) {
                System.out.print("Nota vergonhosa; ");
                continue;
            }
            System.out.print("Nota: " + nota + "; ");
        }
        System.out.println();
        System.out.println("Media arredondada: " + (int) mediaNotas());
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
        if (idade < 12) {
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

    public char getPlano() {
        return plano;
    }

    public void setPlano(char plano) {
        switch (plano) {
            case 'B': System.out.println("Plano Básico - R$100"); break;
            case 'I': System.out.println("Plano Intermediário - R$150"); break;
            case 'A': System.out.println("Plano Avançado - R$200"); break;
            default:  System.out.println("Plano inválido");
        }
        this.plano = plano;
    }

    public double getDesconto() {
        desconto = getIdade() < 13 ? 0.10 : 0.0;
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}
