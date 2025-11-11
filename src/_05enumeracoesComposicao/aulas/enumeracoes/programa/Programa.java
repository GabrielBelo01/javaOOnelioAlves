package _05enumeracoesComposicao.aulas.enumeracoes.programa;

import _05enumeracoesComposicao.aulas.enumeracoes.classes.Pedidos;
import _05enumeracoesComposicao.aulas.enumeracoes.classes.StatusPedido;

import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Pedidos pedidos1 = new Pedidos(1080, new Date(), StatusPedido.AGUARDADO_PAGAMENTO);

        System.out.println("Pedidos: " + pedidos1.toString());


        //Convertendo um objeto tipo String para tipo ENUM
        StatusPedido os1 = StatusPedido.ENVIADO;
        StatusPedido os2 = StatusPedido.valueOf("ENVIADO");

        System.out.println(os1.toString());
        System.out.println(os2.toString());

    }
}
