package exerciciosFixacao.entidade;

public class Banco {
    private int numConta;
    private String nome;
    private double saldo;

    public Banco(int numConta, String nome, double valorDeposito) {
        this.numConta = numConta;
        this.nome = nome;
        depositar(valorDeposito);
    }

    public Banco(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
        saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println(toString());
    }

    public void sacar(double valor) {
        saldo -= valor + 5;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Banco{" +
                "numConta=" + numConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
