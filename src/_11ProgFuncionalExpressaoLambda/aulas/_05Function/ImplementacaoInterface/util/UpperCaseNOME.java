package _11ProgFuncionalExpressaoLambda.aulas._05Function.ImplementacaoInterface.util;

import _11ProgFuncionalExpressaoLambda.aulas._05Function.ImplementacaoInterface.entites.Produto;

import java.util.function.Function;

public class UpperCaseNOME implements Function<Produto, String> {
    @Override
    public String apply(Produto p) {
        return p.getNome().toUpperCase();
    }
}
