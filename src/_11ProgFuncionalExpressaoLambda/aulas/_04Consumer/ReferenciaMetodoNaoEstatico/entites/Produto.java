package _11ProgFuncionalExpressaoLambda.aulas._04Consumer.ReferenciaMetodoNaoEstatico.entites;

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

    public static void  staticAtualiarPreco(Produto p){
        p.setPreco(p.getPreco() * 1.1);
    }

    public void  naoStaticAtualiarPreco(){
        preco *= 1.1;
    }

    public String toString(){
        return this.nome + " - " + String.format("%.2f", this.preco);
    }
}
