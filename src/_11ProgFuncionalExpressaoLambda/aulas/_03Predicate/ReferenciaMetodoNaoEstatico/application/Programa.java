package _11ProgFuncionalExpressaoLambda.aulas._03Predicate.ReferenciaMetodoNaoEstatico.application;

import _11ProgFuncionalExpressaoLambda.aulas._03Predicate.ReferenciaMetodoNaoEstatico.entites.Produto;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        // aqui mostra que ele tambem aceita um metodo, e não apenas um objeto instanciado da classe que implementa o predicado
        list.removeIf(Produto::naoStaticProdutoPredicado);

        for(Produto produto : list){
            System.out.println(produto);
        }

    }
}
