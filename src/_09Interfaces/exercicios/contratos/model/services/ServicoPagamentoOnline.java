package _09Interfaces.exercicios.contratos.model.services;

public interface ServicoPagamentoOnline {
    public Double taxaPagamento(Double valor);
    public Double juros(Double valor, Integer mes);
}
