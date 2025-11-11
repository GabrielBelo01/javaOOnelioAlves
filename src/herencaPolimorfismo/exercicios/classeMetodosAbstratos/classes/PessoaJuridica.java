package herencaPolimorfismo.exercicios.classeMetodosAbstratos.classes;

public class PessoaJuridica  extends Contribuintes{

    private Integer numeroFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, double rendaAnua, Integer numeroFuncionarios) {
        super(nome, rendaAnua);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }


    @Override
    public double calcularImposto() {

        if (this.numeroFuncionarios > 10){
            return this.getRendaAnua() * 0.14;
        } else {
            return this.getRendaAnua() * 0.16;
        }

    }


}
