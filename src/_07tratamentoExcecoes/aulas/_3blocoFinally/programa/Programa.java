package _07tratamentoExcecoes.aulas._3blocoFinally.programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
               Integer numero = sc.nextInt();

               if(numero % 2 == 0 ){
                   listaPar.add(numero);
               } else {
                   listaImpar.add(numero);
               }

            }
        }
        catch (FileNotFoundException e){
            System.out.println("erro ao abrir arquivo: "+ e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
                System.out.println("bloco finally executado");
            }
        }


        for (Integer n : listaPar) {
            System.out.print(n+" ");
        }

        System.out.println();

        for (Integer n : listaImpar) {
            System.out.print(n+" ");
        }

        System.out.println();

        System.out.println("fim");




    }
}
