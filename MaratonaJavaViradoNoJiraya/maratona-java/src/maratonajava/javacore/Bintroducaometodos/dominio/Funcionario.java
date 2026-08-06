package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public byte age;
    public double[] salario;

    public void imprime() {
        System.out.println("-----------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (salario == null) {
            return;
        }
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salario: " + salario[i]);
        }
        media();
    }

    public void media() {
        if (salario == null) {
            return;
        }
        double soma = 0;
        double media = 0;
        for (double num : salario) {
            soma += num;
        }
        media = soma / salario.length;
        System.out.println(media);
    }
}
