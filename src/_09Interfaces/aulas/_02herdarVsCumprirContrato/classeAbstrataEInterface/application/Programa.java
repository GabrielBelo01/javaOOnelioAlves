package _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.application;

import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.entities.AbstrataForma;
import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.entities.Circulo;
import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.entities.Retangulo;
import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.enums.Cor;

import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        AbstrataForma forma1 = new Circulo(Cor.PRETO, 2.0);
        AbstrataForma forma2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);

        System.out.println("Cor do Circulo: " + forma1.getCor());
        System.out.println("Area do Circulo: " + String.format("%.3f" , forma1.area()));
        System.out.println("Cor do Retangulo: " + forma2.getCor());
        System.out.println("Area do Retangulo: " + String.format("%.3f" , forma2.area()));


    }
}
