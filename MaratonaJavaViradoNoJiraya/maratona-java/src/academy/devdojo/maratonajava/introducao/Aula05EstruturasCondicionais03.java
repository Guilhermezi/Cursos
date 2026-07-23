package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        // Doar se salario for maior que 5000
        double salary = 6000;
        // (condicao) ? verdadeiro : falso

        String resultado = salary > 5000 ? "Vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }
}
