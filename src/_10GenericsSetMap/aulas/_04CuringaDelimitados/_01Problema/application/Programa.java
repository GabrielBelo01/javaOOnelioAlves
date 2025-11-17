package _10GenericsSetMap.aulas._04CuringaDelimitados._01Problema.application;

import _10GenericsSetMap.aulas._04CuringaDelimitados._01Problema.entities.Circulo;
import _10GenericsSetMap.aulas._04CuringaDelimitados._01Problema.entities.Forma;
import _10GenericsSetMap.aulas._04CuringaDelimitados._01Problema.entities.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(3.0, 2.0));
        formas.add(new Circulo(2.0));

        List<Circulo> circulos = new ArrayList<>();
        circulos.add(new Circulo(2.0));
        circulos.add(new Circulo(3.0));

        System.out.println("Area total: "+ areaTotal(circulos));

    }

    public static double areaTotal(List<? extends Forma> lista) {
        double soma  = 0.0;

        for (Forma f : lista) {
            soma += f.area();
        }
        return soma;
    }
}
