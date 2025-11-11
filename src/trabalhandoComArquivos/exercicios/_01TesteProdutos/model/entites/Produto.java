package trabalhandoComArquivos.exercicios._01TesteProdutos.model.entites;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){}

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double somarValorTotal(){
        return preco * quantidade;
    }

    public String toString(){
        return this.nome
                +","
                +this.preco
                +","
                +this.quantidade
                +"";
    }

}
