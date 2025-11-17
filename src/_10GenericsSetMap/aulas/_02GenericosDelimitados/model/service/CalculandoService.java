package _10GenericsSetMap.aulas._02GenericosDelimitados.model.service;

import java.util.List;

public class CalculandoService{

    public static <T extends Comparable<T>> T max(List<T> lista){
        if(lista.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }

        T max = lista.get(0);
        for(T item : lista){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }


}

