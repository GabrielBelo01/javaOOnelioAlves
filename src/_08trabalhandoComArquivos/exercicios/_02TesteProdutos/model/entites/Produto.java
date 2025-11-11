package _08trabalhandoComArquivos.exercicios._02TesteProdutos.model.entites;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(){}

    public Produto(String nome, Double preco, Integer quantidade) {
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

    public Double getPreco() {
        return preco;
    }


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double precoTotal(){
        return preco*quantidade;
    }

    public String toString(){
        return getNome()
                + ","
                + String.format("%.2f" , precoTotal());
    }


}
