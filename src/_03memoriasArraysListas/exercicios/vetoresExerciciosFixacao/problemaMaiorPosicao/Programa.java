package vetoresExerciciosFixacao.problemaMaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        int nMaior = 0;
        int posicaoMaior = 0;

        for(int i=0; i< vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            if(vetor[i]>nMaior){
                nMaior = vetor[i];
                posicaoMaior = i;
            }

        }

        System.out.println("Maior Valor: " + nMaior);
        System.out.println("Posicao do maior numero: "+posicaoMaior);



        sc.close();
    }
}
