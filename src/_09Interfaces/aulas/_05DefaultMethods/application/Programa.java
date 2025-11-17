package _09Interfaces.aulas._05DefaultMethods.application;

import _09Interfaces.aulas._05DefaultMethods.model.service.TaxaJurosBrasilServico;
import _09Interfaces.aulas._05DefaultMethods.model.service.TaxaJurosUSAServico;
import _09Interfaces.aulas._05DefaultMethods.model.service.jurosService;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        jurosService tjs = new TaxaJurosUSAServico(1.0);
        double pagamento = tjs.pagamento(valor, meses);

        System.out.println("Pagamento final apos "+ meses + " meses:");
        System.out.println(String.format("É de: %.2f", pagamento));


        sc.close();
    }
}
