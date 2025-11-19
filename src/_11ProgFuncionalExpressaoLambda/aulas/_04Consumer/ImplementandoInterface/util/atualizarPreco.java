package _11ProgFuncionalExpressaoLambda.aulas._04Consumer.ImplementandoInterface.util;

import _11ProgFuncionalExpressaoLambda.aulas._04Consumer.ImplementandoInterface.entites.Produto;

import java.util.function.Consumer;

public class atualizarPreco implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
        p.setPreco(p.getPreco() * 1.10);
    }
}
