package matrizExercicio;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriz = new int[L][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Numero para saber as pocições: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posicao "+i+ ","+j+":");

                    if (j > 0){
                        System.out.println("Esquerda: "+matriz[i][j - 1]);
                    }

                    if (i > 0){
                        System.out.println("Acima: "+matriz[i - 1][j]);
                    }

                    if (j < N - 1){
                        System.out.println("Direita: "+matriz[i][j + 1]);
                    }

                    if (i < L - 1){
                        System.out.println("Abaixo: "+matriz[i + 1][j]);
                    }


                }
            }
        }


        sc.close();
    }
}
