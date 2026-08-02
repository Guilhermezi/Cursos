package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Toto";
        professor.age = 58;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.age + " " + professor.sexo);
    }
}
