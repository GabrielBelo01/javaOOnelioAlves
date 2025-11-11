package vetoresExerciciosFixacao.problemaNumerosPares.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        int cont = 0;

        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i]%2==0){
                cont++;
            }
        }

        System.out.println("Numeros Pares");
        for (int i=0; i<n; i++) {
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Quantidade de pares: "+cont);


        sc.close();

    }
}
