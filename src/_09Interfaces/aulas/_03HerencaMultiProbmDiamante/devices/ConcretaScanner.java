package _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices;

public class ConcretaScanner extends Dispositivo implements Scanner {

    public ConcretaScanner(String numeroSereal) {
        super(numeroSereal);
    }

    @Override
    public void processarDispositivo(String doc) {
        System.out.println("Scanner processando: "+doc);
    }

    public String scan(){
        return "Conteudo digitalizado";
    }
}
