package _11ProgFuncionalExpressaoLambda.aulas._06FuncaoQueRecebeOutraFuncao.model.services;

import _11ProgFuncionalExpressaoLambda.aulas._06FuncaoQueRecebeOutraFuncao.model.entites.Produto;

import java.util.List;
import java.util.function.Predicate;

public class servicoProduto {

    public static double somaFiltrada(List<Produto> list, Predicate<Produto> criterio){
        double soma = 0.0;
        for(Produto p : list){
            if(criterio.test(p)){
                soma += p.getPreco();
            }
        }
        return soma;
    }


}
