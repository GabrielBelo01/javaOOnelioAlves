package _10GenericsSetMap.aulas._10map.exericioResolvido.application;

import _10GenericsSetMap.aulas._10map.exericioResolvido.entites.Produto;

import java.util.HashMap;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {

        Map<Produto, Double> estoque = new HashMap<>();

        Produto p1 = new Produto("Tv", 900.0);
        p1.setQuantidade(10);
        Produto p2 = new Produto("Notebook", 1200.0);
        p2.setQuantidade(10);
        Produto p3 = new Produto("Tablet", 400.0);
        p3.setQuantidade(10);

        estoque.put(p1, p1.getPrecoTotal());
        estoque.put(p2, p2.getPrecoTotal());
        estoque.put(p3, p3.getPrecoTotal());

        Produto ps = new Produto("Tv", 900.0);
        System.out.println("Existe a chave 'ps': " + estoque.containsKey(ps));

        System.out.println("Valor total do p1: " + estoque.get(p1));

    }
}
