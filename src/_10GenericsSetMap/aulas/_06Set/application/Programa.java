package _10GenericsSetMap.aulas._06Set.application;

import java.util.*;

public class Programa {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

//        set.add("Televisao");
//        set.add("Tablet");
//        set.add("Notebook");
//
//        set.removeIf(x -> x.charAt(1) == 'o');
//
//        System.out.println(set.contains("Notebook"));
//
//        for(String s : set){
//            System.out.println(s);
//        }



        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));


        //união
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //interseção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
