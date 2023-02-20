public class Aluno {
    private final String nome;
    private final String matricula;
    private final String situacao;
    private UFFMail email;

    public Aluno(String nome, String matricula, String status) {
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = status;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getStatus() {
        return situacao;
    }

    public UFFMail getEmail() {
        return email;
    }

    public void setEmail(UFFMail email) {
        this.email = email;
    }

    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", situacao='" + situacao + '\'' +
                ", email=" + email +
                '}';
    }
}
