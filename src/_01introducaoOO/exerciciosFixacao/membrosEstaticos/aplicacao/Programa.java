package exerciciosFixacao.membrosEstaticos.aplicacao;

import exerciciosFixacao.membrosEstaticos.util.ConversorMoedas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cotacao do dolar: ");
        double dolarPreco = sc.nextDouble();

        System.out.println("Quantos dolares sera comprado? ");
        double quantia = sc.nextDouble();

        double result = ConversorMoedas.dolarParaReal(dolarPreco, quantia);
        System.out.printf("Valor a ser pago em reais: %.2f%n", result);

    }
}
