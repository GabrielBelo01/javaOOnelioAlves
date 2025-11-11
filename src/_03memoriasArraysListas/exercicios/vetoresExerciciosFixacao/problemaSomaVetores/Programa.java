package vetoresExerciciosFixacao.problemaSomaVetores;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai ter cada vetor??");
       int n = sc.nextInt();

        int vetorA[] = new int[n];
        for (int i=0; i< vetorA.length; i++) {
            System.out.println("Digite o valor vetor A");
            vetorA[i] = sc.nextInt();
        }

        int vetorB[] = new int[n];
        for (int i=0; i<vetorB.length; i++) {
            System.out.println("Digite o valor vetor B");
            vetorB[i] = sc.nextInt();
        }

        int vetorC[] = new int[n];
        for (int i=0; i<vetorC.length; i++) {
            vetorC[i] = vetorA[i]+vetorB[i];
            System.out.printf(vetorC[i]+" ");
        }
    }
}
