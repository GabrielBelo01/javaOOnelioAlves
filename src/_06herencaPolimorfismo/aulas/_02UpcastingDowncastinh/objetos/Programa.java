package _06herencaPolimorfismo.aulas._02UpcastingDowncastinh.objetos;

import _06herencaPolimorfismo.aulas._02UpcastingDowncastinh.classes.Conta;
import _06herencaPolimorfismo.aulas._02UpcastingDowncastinh.classes.ContaEmpresarial;
import _06herencaPolimorfismo.aulas._02UpcastingDowncastinh.classes.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1001,"Belo",0.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002,"Maria",0.0,500);

        //UPCASTING
        // Atribuindo objeto da subClasse a um Objeto da SuperClasse
        Conta conta2 = contaEmpresarial;
        Conta conta3 = new ContaEmpresarial(1003,"Bob",0.0,200);
        Conta conta4 = new ContaPoupanca(1004,"Anna",0.0,0.01);

        //DownCasting
        //Convertendo um objeto da SuperClasse para a SubClasse
        ContaEmpresarial conta5 = (ContaEmpresarial) conta2;
        conta5.emprestimo(100.00);


        if(conta4 instanceof ContaEmpresarial){
            ContaEmpresarial conta6 = (ContaEmpresarial) conta4;
            conta6.emprestimo(100.00);
            System.out.println("Emprestimo");
        }

        if(conta4 instanceof ContaPoupanca){
            ContaPoupanca conta6 = (ContaPoupanca) conta4;
            conta6.atualizarSaldo();
            System.out.println("Updated Saldo");
        }

    }
}
