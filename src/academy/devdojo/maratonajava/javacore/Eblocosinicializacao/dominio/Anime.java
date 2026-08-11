package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou oq for passado
    // 3 - Blocos de inicializacao é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : this.episodios) {
            System.out.print(episodios + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
