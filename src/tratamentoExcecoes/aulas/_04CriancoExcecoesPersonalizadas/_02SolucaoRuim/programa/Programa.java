package tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._02SolucaoRuim.programa;



import tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._02SolucaoRuim.classes.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int numero = sc.nextInt();
        System.out.print("Check-in data (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out data (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: o check-out deve ser depois do check-in ");
        } else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: "+reserva);

            System.out.println();
            System.out.println("Entre com as datas para atualizar a reserva: ");
            System.out.print("Check-in data (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            String erro = reserva.updateDatas(checkIn,checkOut);
            if(erro != null){
                System.out.println(erro);
            } else {
                System.out.print("Reserva atualizada com sucesso "+ reserva);
            }






        }


        sc.close();
    }
}
