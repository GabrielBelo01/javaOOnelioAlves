package _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.entities;

import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.enums.Cor;

public class Circulo  extends AbstrataForma {

    private Double raio;

    public Circulo(Cor cor, Double raio){
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}
