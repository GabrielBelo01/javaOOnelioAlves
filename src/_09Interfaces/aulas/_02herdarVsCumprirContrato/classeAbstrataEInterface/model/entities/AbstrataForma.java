package _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.entities;


import _09Interfaces.aulas._02herdarVsCumprirContrato.classeAbstrataEInterface.model.enums.Cor;

public abstract class AbstrataForma implements Forma {
    private Cor cor;

    public AbstrataForma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
