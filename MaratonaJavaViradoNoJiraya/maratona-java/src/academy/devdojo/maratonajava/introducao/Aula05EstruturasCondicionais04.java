package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 70000.00;
        double finalSalary = 0.00;
        double tax;
        double valueOfTax;

        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;

        if (annualSalary <= 34712.00){
            tax = firstTrack;
        } else if (annualSalary > 34712 && annualSalary <= 68507) {
            tax = secondTrack;
        } else {
            tax = thirdTrack;
        }

        valueOfTax = annualSalary * tax;
        finalSalary = annualSalary - valueOfTax;

        System.out.println("O valor da Taxa paga é de: " + valueOfTax);
        System.out.println("O salario final é de: " + finalSalary);
        System.out.println("Obrigado por pagar sua taxa");
    }
}
