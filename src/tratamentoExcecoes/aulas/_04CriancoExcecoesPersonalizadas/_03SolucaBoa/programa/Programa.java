package tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._03SolucaBoa.programa;



import tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._03SolucaBoa.model.entites.Reserva;
import tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._03SolucaBoa.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto: ");
            int numero = sc.nextInt();
            System.out.print("Check-in data (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com as datas para atualizar a reserva: ");
            System.out.print("Check-in data (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            reserva.updateDatas(checkIn, checkOut);
            System.out.print("Reserva atualizada com sucesso " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formato da data invalido");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }





        sc.close();
    }
}
