package exerciciosFixacao.aplicacao;

import exerciciosFixacao.entidade.Banco;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();


        Banco conta1 = new Banco(0001, "Gabriel");
        Banco conta2 = new Banco(0002, "Maria", 200.00);

        conta2.sacar(198);


    }
}
