package P3.Ficha13;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class questao5 {
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

    public class TesteMapaAluno {
        public static void main(String[] args) {
            Aluno aluno1 = new Aluno(1, "João", 20, "Engenharia");
            Aluno aluno2 = new Aluno(2, "Maria", 22, "Ciência da Computação");
            Aluno aluno3 = new Aluno(3, "Pedro", 21, "Medicina");
            Aluno aluno4 = new Aluno(4, "Ana", 19, "Direito");
            Aluno aluno5 = new Aluno(5, "Carlos", 23, "Arquitetura");

            Map<Integer, Aluno> mapaAluno = new HashMap<>();
            mapaAluno.put(aluno1.getMatricula(), aluno1);
            mapaAluno.put(aluno2.getMatricula(), aluno2);
            mapaAluno.put(aluno3.getMatricula(), aluno3);
            mapaAluno.put(aluno4.getMatricula(), aluno4);
            mapaAluno.put(aluno5.getMatricula(), aluno5);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a matrícula do aluno: ");
            int matriculaDigitada = scanner.nextInt();

            if (mapaAluno.containsKey(matriculaDigitada)) {
                Aluno alunoEncontrado = mapaAluno.get(matriculaDigitada);
                System.out.println("Dados do aluno:");
                System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
                System.out.println("Nome: " + alunoEncontrado.getNome());
                System.out.println("Idade: " + alunoEncontrado.getIdade());
                System.out.println("Curso: " + alunoEncontrado.getCurso());
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }

}
