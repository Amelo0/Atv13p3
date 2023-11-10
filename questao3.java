package P3.Ficha13;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao3 {
    static class Aluno {
        private int matricula;
        private String nome;
        private int idade;
        private String curso;

        // Construtor
        public Aluno(int matricula, String nome, int idade, String curso) {
            this.matricula = matricula;
            this.nome = nome;
            this.idade = idade;
            this.curso = curso;
        }

        // Getters
        public int getMatricula() {
            return matricula;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getCurso() {
            return curso;
        }
    }

    static class CadastroAluno {
        private List<Aluno> listaDeAlunos;

        // Construtor
        public CadastroAluno() {
            this.listaDeAlunos = new ArrayList<>();
        }

        public void adicionarAluno(Aluno aluno) {
            listaDeAlunos.add(aluno);
        }

        public void imprimirListaDeAlunos() {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : listaDeAlunos) {
                System.out.println("Matrícula: " + aluno.getMatricula() +
                        ", Nome: " + aluno.getNome() +
                        ", Idade: " + aluno.getIdade() +
                        ", Curso: " + aluno.getCurso());
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            CadastroAluno cadastro = new CadastroAluno();

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("Digite os dados do aluno " + (i + 1) + ":");
                System.out.print("Matrícula: ");
                int matricula = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Curso: ");
                String curso = scanner.nextLine();

                Aluno aluno = new Aluno(matricula, nome, idade, curso);

                cadastro.adicionarAluno(aluno);
            }

            scanner.close();
            cadastro.imprimirListaDeAlunos();
        }
    }

}
