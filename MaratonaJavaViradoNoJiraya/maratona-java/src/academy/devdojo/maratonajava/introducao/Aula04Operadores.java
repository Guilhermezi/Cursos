package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        double result = number2 / (double) number1;
        System.out.println("Valor:"+result);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)

        int age = 35;
        float salary = 3500F;
        boolean isIntoTheLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isIntoTheLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isIntoTheLawGreaterThanThirty"+isIntoTheLawGreaterThanThirty);
        System.out.println("isIntoTheLawLessThanThirty"+isIntoTheLawLessThanThirty);

    }
}
