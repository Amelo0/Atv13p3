package P3.Ficha13;
import java.util.HashSet;
import java.util.Scanner;

public class questao2 {
    class TesteHashSetCPF {
        public static void main(String[] args) {
            HashSet<String> conjuntoCPF = new HashSet<>();

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o CPF " + (i + 1) + ": ");
                String cpf = scanner.nextLine();
                conjuntoCPF.add(cpf);
            }

            System.out.println("\nConteúdo do conjunto:");

            for (String cpf : conjuntoCPF) {
                System.out.println(cpf);
            }
        }
    }

}
