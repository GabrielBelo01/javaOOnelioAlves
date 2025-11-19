package _11ProgFuncionalExpressaoLambda.aulas._03Predicate.expressaoLambdaInline.application;

import _11ProgFuncionalExpressaoLambda.aulas._03Predicate.expressaoLambdaInline.entites.Produto;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));


        double minimo = 100.0;
        list.removeIf(p -> p.getPreco() >= minimo);

        for(Produto produto : list){
            System.out.println(produto);
        }

    }
}
