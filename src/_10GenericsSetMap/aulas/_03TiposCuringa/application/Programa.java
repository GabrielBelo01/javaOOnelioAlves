package _10GenericsSetMap.aulas._03TiposCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

//        List<Object> objetos = new ArrayList<>();
//        List<Integer> inteiros = new ArrayList<>();
//
//        objetos = inteiros;

        // o superTipo de qualquer tipo de lista é o <?>
        List<?> objetos = new ArrayList<>();
        List<Integer> inteiros = new ArrayList<>();
        objetos = inteiros;


        List<Integer> numerosInteiros = Arrays.asList(5, 2, 10);
        printList(numerosInteiros);

        List<String> meuStr = Arrays.asList("Maria", "Alex", "Bob");
        printList(meuStr);

    }

    public static void printList(List<?> list){
        for (Object item : list){
            System.out.print(item+", ");
        }
        System.out.println();
    }
}
