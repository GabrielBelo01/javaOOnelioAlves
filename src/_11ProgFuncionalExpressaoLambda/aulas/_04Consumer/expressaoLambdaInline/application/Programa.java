package _11ProgFuncionalExpressaoLambda.aulas._04Consumer.expressaoLambdaInline.application;
import _11ProgFuncionalExpressaoLambda.aulas._04Consumer.expressaoLambdaInline.entites.Produto;

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

        double factor = 1.1;
        list.forEach(p -> p.setPreco(p.getPreco() * factor));
        list.forEach(System.out::println);

    }
}
