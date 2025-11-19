package _11ProgFuncionalExpressaoLambda.aulas._02ProgFuncionalCalculoLambda.application;

import _11ProgFuncionalExpressaoLambda.aulas._02ProgFuncionalCalculoLambda.entites.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Programa {

    public static int compareProdutos(Produto p1, Produto p2) {
        return p1.getPreco().compareTo(p2.getPreco());
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Notebook", 1200.0));
        lista.add(new Produto("Tablet", 450.0));

        lista.sort(Programa::compareProdutos);

        for (Produto produto : lista) {
            System.out.println(produto);
        }


        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer soma = 0;
        for (Integer i : lista1) {
            soma += i;
        }
        System.out.println("Soma(Expressividade) "+soma);


        soma = lista1.stream().reduce(0, Integer::sum);
        System.out.println("Soma(Codigo Conciso) "+soma);

    }
}