package vetoresExerciciosFixacao.problemaNegativos.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        int n = sc.nextInt();
        int vetor[] = new int[n];

        System.out.println("Digite um valor: ");
        for (int i=0; i<vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i=0; i< vetor.length; i++) {
            if(vetor[i]<0){
                System.out.println(vetor[i]);
            }
        }






        sc.close();


    }
}
