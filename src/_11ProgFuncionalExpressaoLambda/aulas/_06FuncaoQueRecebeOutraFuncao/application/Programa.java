package _11ProgFuncionalExpressaoLambda.aulas._06FuncaoQueRecebeOutraFuncao.application;

import _11ProgFuncionalExpressaoLambda.aulas._06FuncaoQueRecebeOutraFuncao.model.entites.Produto;
import _11ProgFuncionalExpressaoLambda.aulas._06FuncaoQueRecebeOutraFuncao.model.services.servicoProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list =  new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        System.out.println(servicoProduto.somaFiltrada(list, p -> p.getPreco() <= 100.00));
    }
}
