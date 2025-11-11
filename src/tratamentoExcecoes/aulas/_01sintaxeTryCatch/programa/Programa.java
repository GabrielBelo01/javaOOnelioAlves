package tratamentoExcecoes.aulas._01sintaxeTryCatch.programa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {


        method1();
        System.out.println("FIM");

    }

    public static void method1() {
        System.out.println("***METODO 1 INICIO ****");
        method2();
        System.out.println("***METODO 1 FIM ****");
    }

    public static void method2(){
        System.out.println("***METODO 2 INICIO *****");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida");
        }
        catch (InputMismatchException e){
            System.out.println("Valor invalido");
        }

        sc.close();
        System.out.println("***METODO 2 FIM *****");
    }


}
