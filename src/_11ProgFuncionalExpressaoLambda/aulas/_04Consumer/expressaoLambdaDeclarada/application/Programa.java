package _11ProgFuncionalExpressaoLambda.aulas._04Consumer.expressaoLambdaDeclarada.application;
import _11ProgFuncionalExpressaoLambda.aulas._04Consumer.expressaoLambdaDeclarada.entites.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list =  new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        double factor = 1.1;
        Consumer<Produto> consumer = p -> {
          p.setPreco(p.getPreco() * factor);
        };

        list.forEach(consumer);
        list.forEach(System.out::println);

    }
}
