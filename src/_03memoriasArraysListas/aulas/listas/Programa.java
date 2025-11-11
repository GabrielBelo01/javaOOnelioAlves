package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");// add elemento na lista
        list.add("Alex");// add elemento na lista
        list.add("Bob");// add elemento na lista
        list.add("Anna");// add elemento na lista
        list.add(2, "Marco"); // adiciona elemento no lugar desajado

        System.out.println(list.size()); // ve o tamanho da lista

        for (String x : list) { // para cada String x pertecente a minha lista list, faça:
            System.out.println(x);
        }
        System.out.println("------------------------------------------");


        list.removeIf(x -> x.charAt(0) == 'M'); // remove por predicado
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------------------");


        System.out.println("Index of bob: " + list.indexOf("Bob")); // retorna a posicao do elemento
        System.out.println("Index of marco: " + list.indexOf("marco")); // quando nao existe, retorna -1
        System.out.println("------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList()); // filta lista conforme desajado

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0)== 'J').findFirst().orElse(null); // retorna o primeiro item conforme necessario, quaso nao aja retorna null
        System.out.println(name);


    }
}
