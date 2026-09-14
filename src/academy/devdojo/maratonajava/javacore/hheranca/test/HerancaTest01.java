package academy.devdojo.maratonajava.javacore.hheranca.test;

import academy.devdojo.maratonajava.javacore.hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        endereco.setRua("Rua 9/3/4");
        endereco.setCep("012345-209");
        pessoa.setCpf("1234567890");
        pessoa.setNome("Guilherme");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        funcionario.setNome("Derik");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        System.out.println("-------------------");
        funcionario.imprime();
    }
}
