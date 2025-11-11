package enumeracoesComposicao.exercicios.composicaoPedidos.classes;

import enumeracoesComposicao.exercicios.composicaoPedidos.classes.enums.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momentoDoPedido;
    StatusDoPedido status;

    private Cliente cliente;

    final private List<OrdemDoPedido>  itens = new ArrayList<OrdemDoPedido>();





    public Pedido(){}

    public Pedido(Date momentoDoPedido, StatusDoPedido status, Cliente cliente) {
        this.momentoDoPedido = momentoDoPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomentoDoPedido() {
        return momentoDoPedido;
    }

    public void setMomentoDoPedido(Date momentoDoPedido) {
        this.momentoDoPedido = momentoDoPedido;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }


    public void addItem(OrdemDoPedido ordemDoPedido){
        this.itens.add(ordemDoPedido);
    }

    public void removeItem(OrdemDoPedido ordemDoPedido){
        this.itens.remove(ordemDoPedido);
    }

    public double total(){
        double sum = 0.0;

        for(OrdemDoPedido ordem : itens){
            sum += ordem.subTotal();
        }

        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Resumo do Pedido:\n");
        sb.append("Momento do Pedido: "+sdf.format(momentoDoPedido)+"\n");
        sb.append("Status: "+status+"\n");
        sb.append(cliente.toString());
        sb.append("Itens do pedido: \n");
        for(OrdemDoPedido ordem : itens){
            sb.append(ordem.toString()+"\n");
        }
        sb.append("Preço total: "+total());
        return sb.toString();

    }


}
