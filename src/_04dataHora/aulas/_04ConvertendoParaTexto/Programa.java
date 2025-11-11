package _04dataHora.aulas._04ConvertendoParaTexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-10-28");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-28T01:30:20");
        Instant d06 = Instant.parse("2025-10-28T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("==============");
        System.out.println("d04 = " + d04); // usando o toString, formato ISO8601
        System.out.println("d04 = " + d04.format(fmt1)); // usando o formato que eu quiser, passando como argumento o objeto criado e usando o metodo .format
        System.out.println("d04 = " + fmt1.format(d04)); // agora usando o objeto fmt1 com a função .format e passando de argumento a data d04
        System.out.println("==============");

        System.out.println();

        System.out.println("==============");
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("==============");

        System.out.println();

        System.out.println("==============");
        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("==============");
    }
}
