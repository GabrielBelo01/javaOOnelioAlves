package herencaPolimorfismo.aulas._03SobreposicaoSuperOverride.classes;

public class ContaPoupanca extends Conta{
    private double taxaDeJuros;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String titular, double saldo, double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }


    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldo() {
        saldo += saldo  * taxaDeJuros;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
}
