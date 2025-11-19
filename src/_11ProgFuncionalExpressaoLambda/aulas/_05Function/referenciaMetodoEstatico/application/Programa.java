package _11ProgFuncionalExpressaoLambda.aulas._05Function.referenciaMetodoEstatico.application;

import _11ProgFuncionalExpressaoLambda.aulas._05Function.referenciaMetodoEstatico.entites.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list =  new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        List<String> nomes = list.stream().map(Produto::staticUpperCaseNome).collect(Collectors.toList());
        nomes.forEach(System.out::println);


    }
}
