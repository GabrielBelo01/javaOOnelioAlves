package _10GenericsSetMap.aulas._01introGenerics.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> lista = new ArrayList<>();

    public void addValor (T valor){
        lista.add(valor);
    }

    public T primero(){
        if(lista.isEmpty()){
            throw new IllegalStateException("Lista vazia");
        }
        return lista.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!lista.isEmpty()){
            System.out.print(lista.get(0));
        }

        for(int i = 1; i < lista.size(); i++){
            System.out.print(", " + lista.get(i));
        }
        System.out.println("]");


    }

}
