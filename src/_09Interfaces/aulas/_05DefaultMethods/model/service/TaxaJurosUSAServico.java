package _09Interfaces.aulas._05DefaultMethods.model.service;


public class TaxaJurosUSAServico implements jurosService{

    private double taxaJuros;

    public TaxaJurosUSAServico(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }



}
