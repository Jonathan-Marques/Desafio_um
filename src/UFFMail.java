public class UFFMail {
    private String endereco;
    private String senha;

    public UFFMail(String endereco, String senha) {
        this.endereco = endereco;
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }
}
