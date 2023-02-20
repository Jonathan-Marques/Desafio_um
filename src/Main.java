import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua matrícula:");
        String matricula = scanner.nextLine();

        List<Aluno> alunos = LeitorCSV.lerArquivo("F:\\Desafio_um\\src\\Aluno.CSV");
        Aluno aluno = null;

        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                aluno = a;
                break;
            }
        }

        if (aluno == null || !aluno.getStatus().equals("ativo")) {
            System.out.println("Sua conta não pode ser criada, pois você não está ativo na UFF.");
            return;
        }

        String[] opcoesUFFMail = GeradorUFFMail.gerarOpcoes(aluno.getNome());
        System.out.println(aluno.getNome() + " " + aluno.getMatricula() + " " + aluno.getStatus() + " " + (aluno.getEmail() != null ? aluno.getEmail().getEndereco() : "Nenhum endereço de e-mail encontrado."));
        System.out.println(Arrays.toString(opcoesUFFMail));
    }
}
