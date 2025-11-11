package herencaPolimorfismo.exercicios.classeMetodosAbstratos.classes;

public class PessoaFisica extends Contribuintes{
    private double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnua, double gastosSaude) {
        super(nome, rendaAnua);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }


    @Override
    public double calcularImposto() {

        double imposto = 0;

        if(this.getRendaAnua() < 2000.00){
            imposto = getRendaAnua() * 0.15;
        } else {
            imposto = getRendaAnua() * 0.25;
        }

        if (this.getGastosSaude() > 0) {
            return imposto - (this.getGastosSaude() / 2);
        } else {
            return imposto;
        }



    }

}
