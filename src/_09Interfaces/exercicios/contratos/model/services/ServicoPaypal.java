package _09Interfaces.exercicios.contratos.model.services;

public class ServicoPaypal implements ServicoPagamentoOnline {
    @Override
    public Double taxaPagamento(Double valor) {
        return valor * 0.02;
    }

    @Override
    public Double juros(Double valor, Integer mes) {
        double taxa = 0.01;
        return  valor * taxa * mes;
    }

}
