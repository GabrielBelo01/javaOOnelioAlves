package _09Interfaces.aulas._03HerencaMultiProbmDiamante.application;

import _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices.ComboDispositivo;
import _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices.ConcretaImpressora;
import _09Interfaces.aulas._03HerencaMultiProbmDiamante.devices.ConcretaScanner;

public class Programa {
    public static void main(String[] args) {

        ConcretaImpressora impressora = new ConcretaImpressora("1080");
        impressora.processarDispositivo("Minha carta");
        impressora.imprimir("Minha carta");

        System.out.println();

        ConcretaScanner scanner = new ConcretaScanner("2003");
        scanner.processarDispositivo("Meu e-mail");
        System.out.println("Scan resultado: "+scanner.scan());

        System.out.println();

        ComboDispositivo comboDispositivo = new ComboDispositivo("2081");
        comboDispositivo.processarDispositivo("Meu Trabalho");
        comboDispositivo.imprimir("Meu Trabalho");
        System.out.println("Scan resultado: "+comboDispositivo.scan());
    }
}
