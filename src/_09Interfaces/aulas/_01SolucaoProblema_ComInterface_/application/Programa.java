package _09Interfaces.aulas._01SolucaoProblema_ComInterface_.application;

import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.entites.AluguelCarro;
import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.entites.Veiculo;
import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.services.ServicoAluguel;
import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.services.ServicoImpostoBrasil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime dataRetirada = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime dataRetorno = LocalDateTime.parse(sc.nextLine(), fmt);

        AluguelCarro ac = new  AluguelCarro(dataRetirada, dataRetorno, new Veiculo(modeloCarro));

        System.out.print("Entre com o preço por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoPorDia = sc.nextDouble();

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new ServicoImpostoBrasil());

        servicoAluguel.processoGerandoFatura(ac);

        System.out.println("FATURA:");
        System.out.print("Pagamento basico: "+ac.getFatura().getPagamentoBasico());
        System.out.println();
        System.out.print("Imposto: "+ac.getFatura().getImposto());
        System.out.println();
        System.out.print("Pagemento total: "+ac.getFatura().getPagamentoTotal());







        sc.close();
    }
}
