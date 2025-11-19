package _11ProgFuncionalExpressaoLambda.aulas._05Function.expressaoLambdaDeclarada.application;

import _11ProgFuncionalExpressaoLambda.aulas._05Function.expressaoLambdaDeclarada.entites.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list =  new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        Function<Produto, String> fuction = p -> p.getNome().toUpperCase();

        List<String> nomes = list.stream().map(fuction).collect(Collectors.toList());
        nomes.forEach(System.out::println);


    }
}
