package _11ProgFuncionalExpressaoLambda.aulas._05Function.referenciaMedotoNaoEstatico.entites;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static String staticUpperCaseNome(Produto p) {
        return p.nome.toUpperCase();
    }

    public String naoStaticUpperCaseNome() {
       return nome.toUpperCase();
    }

    public String toString(){
        return this.nome + " - " + String.format("%.2f", this.preco);
    }
}
