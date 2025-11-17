package _09Interfaces.exercicios.contratos.model.services;

import _09Interfaces.exercicios.contratos.model.entities.Contrato;
import _09Interfaces.exercicios.contratos.model.entities.Parcelas;

import java.time.LocalDate;

public class ServicoContrato {

    private ServicoPagamentoOnline servicoPagmentoOnline;

    public ServicoContrato(ServicoPagamentoOnline servicoPagmentoOnline) {
        this.servicoPagmentoOnline = servicoPagmentoOnline;
    }

    public ServicoPagamentoOnline getServico() {
        return servicoPagmentoOnline;
    }

    public void setServico(ServicoPagamentoOnline servicoPagmentoOnline) {
        this.servicoPagmentoOnline = servicoPagmentoOnline;
    }

    public void processoContrato (Contrato contrato, Integer mes) {

        double parcelaBasica = contrato.getValorTotal() / mes;

       for (int i = 1; i <= mes; i++) {
           LocalDate dataVencimento = contrato.getDataContrato().plusMonths(i);

            double juros = servicoPagmentoOnline.juros(parcelaBasica, i);
            double taxa = servicoPagmentoOnline.taxaPagamento(parcelaBasica + juros);
            double valorFinal = juros + taxa + parcelaBasica;


            contrato.getParcelas().add(new Parcelas(dataVencimento, valorFinal));

       }

    }

//    public void processoContrato (Contrato contrato, Integer mes) {
//
//        double parcelaBasica = contrato.getValorTotal() / mes;
//
//        for (int i = 1; i <= mes; i++) {
//
//            double valorComJuros = parcelaBasica + servicoPagmentoOnline.juros(parcelaBasica, i);
//            double valorFinal = valorComJuros + servicoPagmentoOnline.taxaPagamento(valorComJuros);
//
//           Parcelas parcelas = new Parcelas(contrato.getDataContrato().plusMonths(i), valorFinal);
//
//             contrato.addParcelas(parcelas);
//
//        }
//
//    }

}
