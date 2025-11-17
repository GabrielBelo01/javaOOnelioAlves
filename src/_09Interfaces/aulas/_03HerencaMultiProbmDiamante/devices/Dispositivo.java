package _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices;

public abstract class Dispositivo {

    private String numeroSereal;

    public Dispositivo(String numeroSereal) {
        this.numeroSereal = numeroSereal;
    }

    public String getNumeroSereal() {
        return numeroSereal;
    }

    public void setNumeroSereal(String numeroSereal) {
        this.numeroSereal = numeroSereal;
    }

    public abstract void processarDispositivo(String doc);
}
