import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
    public static List<Aluno> lerArquivo(String caminhoArquivo) {
        List<Aluno> alunos = new ArrayList<>();
        try {
            CSVReader csvReader = new CSVReader(";");
            List<String[]> linhas = csvReader.readNext(caminhoArquivo);

            for (String[] linha : linhas) {
                if (linha.length >= 3) {
                    String nome = linha[0];
                    String matricula = linha[1];
                    String status = linha[2].toLowerCase();

                    if (status.equalsIgnoreCase("ativo")) {
                        Aluno aluno = new Aluno(nome, matricula, status);
                        alunos.add(aluno);
                    }
                } else {
                    System.out.println("Erro ao ler o arquivo CSV:");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo CSV " + caminhoArquivo + ": " + e.getMessage());
        }
        return alunos;
    }
}
