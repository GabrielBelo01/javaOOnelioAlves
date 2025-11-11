package tratamentoExcecoes.exercicios.contaBanco.model.entites;


import tratamentoExcecoes.exercicios.contaBanco.model.exceptions.DomainException;

public class Conta {
    private Integer numero;
    private String titular;
    private double saldo;
    private double LimiteSaque;

    public Conta(){}

    public Conta(Integer numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        LimiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public double getLimiteSaque() {
        return LimiteSaque;
    }

    public void Depositar(double valor){
        this.saldo += valor;
    }

    public void Sacar(double valor){
        this.saldo -= valor;
    }

    public void deposita (double valor){
        this.saldo += valor;
    }

    public void saque(double valor){


        if (valor > this.LimiteSaque){
            throw new DomainException("Erro ao sacar: o valor do saque excede o limite");
        }

        if(valor > this.saldo){
            throw new DomainException("Erro ao sacar: saldo insuficiente");
        }


        this.saldo -= valor;

    }

    public String toString(){
        return "New Balance: "
                + this.saldo;
    }

}
