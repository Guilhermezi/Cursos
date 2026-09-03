package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Local {
    private String endereco;

    public Local() {
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void Imprime() {
        System.out.println("---Local---");
        System.out.println(this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
