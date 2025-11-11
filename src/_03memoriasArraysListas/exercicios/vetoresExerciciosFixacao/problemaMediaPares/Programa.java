package vetoresExerciciosFixacao.problemaMediaPares;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, soma, c = 0;

        System.out.println("Quantos elementos vai ter o vetor?");
        n = sc.nextInt();


        float[] vetor = new float[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextFloat();
        }

        soma = 0;


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                soma += vetor[i];
                c++;
            }
        }

        if (c ==0 ){
            System.out.println("Nenhum numero par foi encontrado");
        } else {
            int resultado = soma / c;

            System.out.println("Media do vetor " + resultado);
        }


    }
}
