package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salario;
    private double media;

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

        for (double num : salario) {
            soma += num;
        }
        media = soma / salario.length;
        System.out.println(media);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
