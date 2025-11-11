package tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._01SolocucaoMuitoRuim.programa;

import tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._01SolocucaoMuitoRuim.classes.Reserva;

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


            Date now = new Date();

            if(checkIn.before(now) || checkOut.before(now) ) {
                System.out.println("Erro na reserva: as data de reserva para atualização devem ser datas futuras");

            } else  if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: o check-out deve ser depois do check-in ");
            } else {
                reserva.updateDatas(checkIn, checkOut);
                System.out.println("Reserva: "+reserva);
            }



        }



















        sc.close();
    }
}
