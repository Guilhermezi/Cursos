package academy.devdojo.maratonajava.exercicios.academia.dominio;

import java.util.Arrays;

public class Turma {
    private char nomeTurma;
    private static int limiteAlunos = 20;
    private String tipo;
    private int[] diasDeTreino;
    private String[] alunos;

    {
        int[] treinos = {5, 8, 24, 21, 10, 14, 27};
        Arrays.sort(treinos);
        this.diasDeTreino = treinos;
    }

    public Turma(char nomeTurma, String tipo, String[] alunos) {
        this.nomeTurma = nomeTurma;
        this.tipo = tipo;
        this.alunos = alunos;
    }

    public void imprimir() {
        System.out.println("---------Turma-----------");
        System.out.println("Nome: " + this.nomeTurma);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dias de treino: " + Arrays.toString(this.diasDeTreino));
        if (alunos.length > limiteAlunos) {
            System.out.println("A quantidade de alunos excede o limite: " + limiteAlunos);
        } else {
            System.out.println("Alunos:");
            for (int i = 0; i < alunos.length; i++) {
                System.out.print(alunos[i] + "; ");
            }
            System.out.println();
        }
    }

    public String matricula() {
        int matriculados = alunos.length;
        while (matriculados < limiteAlunos) {
            System.out.println("Estamos aceitando alunos, temos: " + (limiteAlunos - matriculados) + " Vagas disponiveis");
            matriculados++;
        }
        return matriculados + "";
    }


    public char getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(char nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int[] getDiasDeTreino() {
        return diasDeTreino;
    }

    public void setDiasDeTreino(int[] diasDeTreino) {
        this.diasDeTreino = diasDeTreino;
    }
}