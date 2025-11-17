package _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.model.entities;

import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrata.model.enums.Cor;

public abstract class Forma {

    private Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract Double area();

}
