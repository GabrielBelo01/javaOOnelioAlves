package _06herencaPolimorfismo.aulas._04ClassesMetodosFinal.classes;

public class ContaEmpresarial extends Conta {
    private double limiteEmprestimo;

    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, double saldo, double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }


    public void emprestimo(double valor){
        if(valor <= this.limiteEmprestimo){
            saldo += valor - 10;
        }
    }
    @Override
    public void sacar(double valor){
        super.sacar(valor);
        saldo -= 2.0;
    }
}
