package enumeracoesComposicao.exercicios.composicaoPedidos.classes;

public class OrdemDoPedido {
    private Integer quantidade;
    private double preco;

    private Produto produto;

    public OrdemDoPedido() {}

    public OrdemDoPedido(Integer quantidade,  Produto produto, double preco) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public double subTotal(){
        return preco*quantidade;
    }

    public String toString(){
        return getProduto().getNome()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }


}
