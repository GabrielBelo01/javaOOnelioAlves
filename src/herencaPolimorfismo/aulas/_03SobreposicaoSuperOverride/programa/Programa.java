package herencaPolimorfismo.aulas._03SobreposicaoSuperOverride.programa;

import herencaPolimorfismo.aulas._03SobreposicaoSuperOverride.classes.Conta;
import herencaPolimorfismo.aulas._03SobreposicaoSuperOverride.classes.ContaEmpresarial;
import herencaPolimorfismo.aulas._03SobreposicaoSuperOverride.classes.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1001, "Alex", 1000.0);
        conta1.sacar(200);
        System.out.println(conta1.getSaldo());

        Conta  conta2 = new ContaPoupanca(1002, "Maria", 1000.00,0.01);
        conta2.sacar(200);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
        conta3.sacar(200);
        System.out.println(conta3.getSaldo());
    }
}
