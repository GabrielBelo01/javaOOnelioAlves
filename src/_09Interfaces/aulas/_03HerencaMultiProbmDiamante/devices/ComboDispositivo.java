package _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices;

public class ComboDispositivo extends Dispositivo implements Scanner, Impressora {

    public ComboDispositivo(String numeroSereal) {
        super(numeroSereal);
    }

    @Override
    public void imprimir(String c){
        System.out.println("Combo Impressora: "+c);
    }

    @Override
    public String scan() {
        return "Combo Impressora resultado";
    }

    @Override
    public void processarDispositivo(String c) {
        System.out.println("Combo processando: "+ c);
    }


}
