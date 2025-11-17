package _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.application;

import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.model.entities.Circulo;
import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.model.entities.Forma;
import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.model.entities.Retangulo;
import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.model.enums.Cor;

import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Forma forma1 = new Circulo(Cor.PRETO, 2.0);
        Forma forma2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);

        System.out.println("Cor do Circulo: " + forma1.getCor());
        System.out.println("Area do Circulo: " + String.format("%.3f" , forma1.area()));
        System.out.println("Cor do Retangulo: " + forma2.getCor());
        System.out.println("Area do Retangulo: " + String.format("%.3f" , forma2.area()));


    }
}
