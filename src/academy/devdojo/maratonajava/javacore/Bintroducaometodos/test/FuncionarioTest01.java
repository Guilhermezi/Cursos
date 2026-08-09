package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setName ("Vaniton");
        func.setAge(16);
        func.setSalario(new double[]{1623.15, 1568.46, 1473.48});

        func.imprime();
    }
}
