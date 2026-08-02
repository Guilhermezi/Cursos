package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais01 {
    static void main(String[] args) {
        int age = 20;
        boolean isAutorizadoComprarBebido= age >= 18;
        // !
        if (isAutorizadoComprarBebido){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não autorizado a comprar bebeida alcólica");
        }

//        if (!isAutorizadoComprarBebido){
//            System.out.println("Não autorizado a comprar bebeida alcólica");
//        }

        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
