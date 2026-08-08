package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int age;
    public char sexo;

    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nome);
        System.out.println(this.age);
        System.out.println(this.sexo);
    }
}
