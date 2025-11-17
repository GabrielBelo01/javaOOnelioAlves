package _10GenericsSetMap.aulas._01introGenerics.application;

import _10GenericsSetMap.aulas._01introGenerics.model.services.PrintService;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantos valores vão ser adicionados: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String valor =  sc.next();
            ps.addValor(valor);
        }


        ps.print();
        String x = ps.primero();
        System.out.println("Primeiro: "+x);


    }
}
