package _06herencaPolimorfismo.aulas._05IntroPolimorfismo.programa;

import _06herencaPolimorfismo.aulas._05IntroPolimorfismo.classes.Conta;
import _06herencaPolimorfismo.aulas._05IntroPolimorfismo.classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        Conta x = new Conta(1020, "Alex", 1000.0);
        Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);

        List<Conta> contas = new ArrayList<>();
        Collections.addAll(contas, x, y);

        for(Conta c : contas){
            c.sacar(50);
            System.out.println(c.getSaldo());
        }



    }
}
