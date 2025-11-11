package exerciciosFixacao.membrosEstaticos.util;

public class ConversorMoedas {
    public static double IOF = 0.06;

    public static double dolarParaReal(double dolarPreco, double quantia){
        double total = dolarPreco * quantia;
        return total + total * IOF;
    }


}
