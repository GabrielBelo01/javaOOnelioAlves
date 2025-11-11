package tratamentoExcecoes.exercicios.contaBanco.aplicacao;

import tratamentoExcecoes.exercicios.contaBanco.model.entites.Conta;
import tratamentoExcecoes.exercicios.contaBanco.model.exceptions.DomainException;


import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite as informações da conta: ");
            System.out.print("Numero: ");
            Integer numero = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limite = sc.nextDouble();

            Conta conta = new Conta(numero, titular, saldo, limite);

            System.out.print("Valor do saque: ");
            double valorSaque = sc.nextDouble();

            conta.saque(valorSaque);
            System.out.println(conta);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }
        finally{
            sc.close();
        }


    }
}
