package P3.Ficha13;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class questao4 {

    public static class ConjuntoDePalavras {
        private Set<String> conjunto;
        public ConjuntoDePalavras(String palavras) {
            String[] arrayPalavras = palavras.split(",");
            this.conjunto = new HashSet<>(Arrays.asList(arrayPalavras));
        }

        public boolean contemTodas(String palavras) {
            String[] arrayPalavras = palavras.split(",");
            Set<String> palavrasParaVerificar = new HashSet<>(Arrays.asList(arrayPalavras));

            return conjunto.containsAll(palavrasParaVerificar);
        }

        public static void main(String[] args) {
            ConjuntoDePalavras conjuntoDePalavras = new ConjuntoDePalavras("java,python,csharp");

            String palavrasParaVerificar = "java,csharp";
            boolean resultado = conjuntoDePalavras.contemTodas(palavrasParaVerificar);

            System.out.println("O conjunto contém todas as palavras? " + resultado);
        }
    }
}