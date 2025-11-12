package _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.services;

import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.entites.AluguelCarro;
import _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.entites.Fatura;

import java.time.Duration;

public class ServicoAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private ServicoImposto servicoImposto;

    public ServicoAluguel(Double precoPorHora, Double precoPorDia, ServicoImposto servicoImposto) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.servicoImposto = servicoImposto;
    }

    public void processoGerandoFatura(AluguelCarro aluguelCarro) {

        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        double horas = minutos / 60;

        double pagamentoBasico;
        if(horas <= 12){
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        }
        else{
            pagamentoBasico = precoPorDia *  Math.ceil(horas / 24);
        }

        double imposto = servicoImposto.imposto(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico,imposto));

    }

}
