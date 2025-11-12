package _09Interfaces.exercicios.contratos.model.services;

import _09Interfaces.exercicios.contratos.model.entities.Contrato;
import _09Interfaces.exercicios.contratos.model.entities.Parcelas;

public class ServicoContrato {

    private ServicoPagamentoOnline servico;

    public ServicoContrato(ServicoPagamentoOnline servico) {
        this.servico = servico;
    }

    public ServicoPagamentoOnline getServico() {
        return servico;
    }

    public void setServico(ServicoPagamentoOnline servico) {
        this.servico = servico;
    }

    public void processoContrato (Contrato contrato, Integer mes) {

        double valorBase = contrato.getValorTotal() / mes;

       for (int i = 1; i <= mes; i++) {

            double valorComJuros = valorBase + servico.juros(valorBase, i);

            double valorFinal = valorComJuros + servico.taxaPagamento(valorComJuros);

            Parcelas parcelas = new Parcelas(contrato.getDataContrato().plusMonths(i), valorFinal);
            contrato.addParcelas(parcelas);

       }

    }

}
