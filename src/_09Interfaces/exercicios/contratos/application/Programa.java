package _09Interfaces.exercicios.contratos.application;


import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.services.ServicoAluguel;
import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.services.ServicoImpostoBrasil;
import _09Interfaces.exercicios.contratos.model.entities.Contrato;
import _09Interfaces.exercicios.contratos.model.entities.Parcelas;
import _09Interfaces.exercicios.contratos.model.services.ServicoContrato;
import _09Interfaces.exercicios.contratos.model.services.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        Contrato c1 = new Contrato(numero, dataContrato, valorContrato);

        System.out.print("Entre com o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

//        ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new ServicoImpostoBrasil());
        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
        servicoContrato.processoContrato(c1, numeroParcelas);

        System.out.println("PARCELAS: ");

        for(Parcelas p : c1.getParcelas()){
            System.out.println(p);
        }


        sc.close();
    }
}
