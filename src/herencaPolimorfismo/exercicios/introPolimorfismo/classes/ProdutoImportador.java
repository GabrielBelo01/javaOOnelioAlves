package herencaPolimorfismo.exercicios.introPolimorfismo.classes;

public class ProdutoImportador  extends Produto {

    private double taxaAlfandega;

    public ProdutoImportador() {
        super();
    }

    public ProdutoImportador(String name, Double preco, double taxaAlfandega) {
        super(name, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal(){
        return getPreco() + this.taxaAlfandega;
    }

    @Override
    public String tagPreco(){
       return "Tablet $ "+String.format("%.2f",precoTotal()) + " (Custo da alfandega: $"+String.format("%.2f",taxaAlfandega)+")";
    }

}
