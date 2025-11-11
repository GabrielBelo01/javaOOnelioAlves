package _06herencaPolimorfismo.aulas._07ClassesAbstratas.programa;

import _06herencaPolimorfismo.aulas._07ClassesAbstratas.classes.Conta;
import _06herencaPolimorfismo.aulas._07ClassesAbstratas.classes.ContaEmpresarial;
import _06herencaPolimorfismo.aulas._07ClassesAbstratas.classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Conta> lista = new ArrayList<>();

        Conta conta2 = new ContaPoupanca(1001, "maria", 500.00, 0.01);
        Conta conta3 = new ContaEmpresarial(1002, "Maria", 1000.00, 400);
        Conta conta4 = new ContaPoupanca(1003, "Bob", 300.00, 0.01);
        Conta conta5 = new ContaEmpresarial(1004, "Anna", 500.00, 500);


        Collections.addAll(lista,conta2,conta3,conta4,conta5);

        double soma = 0;
        for (Conta c : lista) {
            soma += c.getSaldo();
        }
        System.out.println(String.format("Total saldo: %.2f", soma));

        for (Conta c : lista) {
            c.depositar(10.00);
        }

        for (Conta c : lista) {
            System.out.printf("Aumentado o saldo da conta %d: %.2f%n", c.getNumero(), c.getSaldo());
        }

        soma = 0;
        for (Conta c : lista) {
            soma += c.getSaldo();
        }
        System.out.println(String.format("Total saldo: %.2f", soma));




    }
}
