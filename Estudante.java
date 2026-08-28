import java.util.Scanner;

public class Estudante {

    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas() {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public double calculaMedia(int[] pesos) {

        double somaNotas = 0;
        int somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return 
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double menorNota() {
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }
}