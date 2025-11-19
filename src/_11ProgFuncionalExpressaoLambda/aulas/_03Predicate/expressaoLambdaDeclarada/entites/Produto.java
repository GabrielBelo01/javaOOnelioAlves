package _11ProgFuncionalExpressaoLambda.aulas._03Predicate.expressaoLambdaDeclarada.entites;

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

    public static boolean staticProdutoPredicado (Produto p){
        return p.getPreco() >= 100;
    }

    public boolean naoStaticProdutoPredicado (){
        return preco <= 100;
    }

    public String toString(){
        return this.nome + " - " + this.preco;
    }
}
