package _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices;

public class ConcretaImpressora extends Dispositivo implements Impressora{

    public ConcretaImpressora(String numeroSereal) {
        super(numeroSereal);
    }

    @Override
    public void processarDispositivo(String doc) {
        System.out.println("Impressora processando: "+doc);
    }

    @Override
    public void imprimir (String doc){
        System.out.println("Imprimindo: "+doc);
    }
}
