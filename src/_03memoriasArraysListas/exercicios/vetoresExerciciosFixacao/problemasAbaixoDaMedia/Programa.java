package vetoresExerciciosFixacao.problemasAbaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos o vetor vai ter??");
        int n = sc.nextInt();

        float vetor[] = new float[n];
        for(int i=0; i< vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextFloat();
        }

        System.out.println();

        float soma = 0;

        for(int i=0; i< vetor.length; i++){
            soma += vetor[i];
        }

        float resultado = soma/ vetor.length;

        System.out.printf("Media do vetor %.3f%n",resultado);

        System.out.println("Elementos abaixo da media");
        for(int i=0; i< vetor.length; i++){
            if(vetor[i]<resultado){
                System.out.println(vetor[i]);
            }
        }


    }
}
