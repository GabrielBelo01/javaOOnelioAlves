package _05enumeracoesComposicao.aulas.enumeracoes.classes;

import java.util.Date;

public class Pedidos {

    private Integer id;
    private Date moment;
    private StatusPedido status;

    public Pedidos(){

    }

    public Pedidos(Integer id, Date moment, StatusPedido status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
