package academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou oq for passado
    // 3 - Blocos de inicializacao é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao normal");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
