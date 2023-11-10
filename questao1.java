package P3.Ficha13;
import java.util.ArrayList;

public class questao1 {


    static class Circulo {
        private double raio;

        // Construtor
        public Circulo(double raio) {
            this.raio = raio;
        }

        public double calcularArea() {
            return Math.PI * Math.pow(raio, 2);
        }

        public static void main(String[] args) {
            Circulo circulo1 = new Circulo(3.0);
            Circulo circulo2 = new Circulo(5.5);
            Circulo circulo3 = new Circulo(2.8);
            Circulo circulo4 = new Circulo(7.2);
            Circulo circulo5 = new Circulo(4.1);

            ArrayList<Circulo> listaDeCirculos = new ArrayList<>();
            listaDeCirculos.add(circulo1);
            listaDeCirculos.add(circulo2);
            listaDeCirculos.add(circulo3);
            listaDeCirculos.add(circulo4);
            listaDeCirculos.add(circulo5);

            for (Circulo circulo : listaDeCirculos) {
                double area = circulo.calcularArea();
                System.out.println("Área do círculo com raio " + circulo.raio + ": " + area);
            }
        }
    }

}
