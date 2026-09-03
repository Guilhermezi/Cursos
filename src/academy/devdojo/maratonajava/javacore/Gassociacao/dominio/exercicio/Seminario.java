package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.exercicio;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local local;
    private Professor professor;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno) {
        this.titulo = titulo;
        this.aluno = aluno;
    }

    public void Imprime(){
        System.out.println("---Seminario ---");
        System.out.println("Titulo: " + this.titulo);
        if (this.aluno != null) {
            for (Aluno aluno : this.aluno) {
                System.out.println("Aluno: " + aluno.getNome());
            }
        }
        System.out.println("Local: " + (this.local != null ? this.local.getEndereco() : "não definido"));
        System.out.println("Professor: " + (this.professor != null ? this.professor.getNome() : "não definido"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
