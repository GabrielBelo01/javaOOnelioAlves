package herencaPolimorfismo.aulas._06ExercicioResolvido.classes;

public class FuncionariosTercerizados  extends Funcionarios{

    private double custoAdicional;

    public FuncionariosTercerizados(){
        super();
    }

    public FuncionariosTercerizados(String nome, Integer horas, Double valorPorHora, double custoAdicional) {
        super(nome, horas, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + this.custoAdicional * 1.1;

    }

}
