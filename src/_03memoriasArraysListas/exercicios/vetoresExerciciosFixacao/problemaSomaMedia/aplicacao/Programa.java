package vetoresExerciciosFixacao.problemaSomaMedia.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n];

        System.out.println("Digite um valor: ");
        for (int i=0; i< vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i=0; i< vetor.length; i++) {
            soma+= vetor[i];
        }

        double media = soma/ vetor.length;


        for (int i=0; i< vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.println();
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+media);




        sc.close();

    }
}
