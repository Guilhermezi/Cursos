package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    static void main(String[] args) {

        byte day = 5;
        // char, int, byte, short, enum, String
        switch (day){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SAB");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homen");
                break;
            case 'S':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }
}
