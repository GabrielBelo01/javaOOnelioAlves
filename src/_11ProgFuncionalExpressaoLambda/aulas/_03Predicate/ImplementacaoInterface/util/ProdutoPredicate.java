package _11ProgFuncionalExpressaoLambda.aulas._03Predicate.ImplementacaoInterface.util;

import _11ProgFuncionalExpressaoLambda.aulas._03Predicate.ImplementacaoInterface.entites.Produto;

import java.util.function.Predicate;

public class ProdutoPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto p) {
        return p.getPreco() >= 100;
    }
}
