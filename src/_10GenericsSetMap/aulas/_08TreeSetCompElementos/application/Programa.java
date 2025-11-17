package _10GenericsSetMap.aulas._08TreeSetCompElementos.application;

import _10GenericsSetMap.aulas._08TreeSetCompElementos.entities.Produto;

import java.util.Set;
import java.util.TreeSet;

public class Programa {
    public static void main(String[] args) {

        Set<Produto> set = new TreeSet<>();

        set.add(new Produto("Tv", 900.00));
        set.add(new Produto("Notebook", 1200.0));
        set.add(new Produto("Tablet", 400.0));

        for (Produto produto : set) {
            System.out.println(produto);
        }


    }
}
