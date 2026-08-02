package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long bigNumber = (long) 155.23;
        double salaryDouble = 2000.0D;
        double salaryFloat = (float) 2500.0D;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = '\u0041';
        String name = "Guilherme";


        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(character);
        System.out.println("Oi meu nome é "+name);

    }
}
