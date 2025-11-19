package _11ProgFuncionalExpressaoLambda.aulas._03Predicate.expressaoLambdaDeclarada.application;

import _11ProgFuncionalExpressaoLambda.aulas._03Predicate.expressaoLambdaDeclarada.entites.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Programa {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        double minimo = 100.0;
        Predicate<Produto> pred = p -> p.getPreco() >= minimo;

        list.removeIf(pred);

        for(Produto produto : list){
            System.out.println(produto);
        }

    }
}
