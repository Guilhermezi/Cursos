package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        //  utilizando switch e dados os valores de 1 a 7 imprima de é dia util ou final de semanda
        // Considerando 1 como domingo

        byte day = 5;
        String phase;
        switch (day){
            case 1:
            case 7:
                phase = "Hoje é um final de semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case  6:
                phase = "Hoje é um dia util da semana";
                break;
            default:
                phase = "Erro, número não encontrado";
                break;
        }
        System.out.println(phase);
    }
}
