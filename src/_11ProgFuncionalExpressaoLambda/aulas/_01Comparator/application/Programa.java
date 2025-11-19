package _11ProgFuncionalExpressaoLambda.aulas._01Comparator.application;

import _11ProgFuncionalExpressaoLambda.aulas._01Comparator.entites.Produto;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Notebook", 1200.0));
        lista.add(new Produto("Tablet", 450.0));


        lista.sort( (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Produto produto : lista) {
            System.out.println(produto);
        }

    }
}