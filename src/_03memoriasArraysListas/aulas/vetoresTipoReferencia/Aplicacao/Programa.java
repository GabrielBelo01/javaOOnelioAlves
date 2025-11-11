package vetoresTipoReferencia.Aplicacao;

import vetoresTipoReferencia.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i=0; i< vetor.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double preco = sc.nextDouble();

            vetor[i] = new Produto(name, preco);
        }

        double soma = 0.0;

        for (int i=0; i< vetor.length; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("Media: %.2f%n", media);

        sc.close();

    }
}
