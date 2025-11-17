package _09Interfaces.aulas._05DefaultMethods.model.service;


public class TaxaJurosBrasilServico implements jurosService{

    private double taxaJuros;

    public TaxaJurosBrasilServico(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }



}
