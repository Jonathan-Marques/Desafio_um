public class GeradorUFFMail {
    public static String[] gerarOpcoes(String nomeCompleto) {
        String[] partesNome = nomeCompleto.toLowerCase().split(" ");
        String nome = partesNome[0];
        String sobrenome = partesNome[partesNome.length - 1];

        String[] opcoes = new String[3];
        opcoes[0] = nome + "." + sobrenome + "@id.uff.br";
        opcoes[1] = nome.charAt(0) + sobrenome + "@id.uff.br";
        opcoes[2] = nome + "." + sobrenome.charAt(0) + "@id.uff.br";

        return opcoes;
    }
}

