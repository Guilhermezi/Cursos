package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confimo que recebi o salário de <salário> na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    static void main(String[] args) {
        String name = "Guilherme Izidio Nogueira";
        String address = "Casa da mãe joana 368";
        double salary = 5000.50;
        String dateSalary = "10/12/2026";


        System.out.println("Eu "+name+", morando no endereço "+address+",\n" +
                "confimo que recebi o salário de "+salary+" na data "+dateSalary);
    }
}