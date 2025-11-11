package dataHora.aulas._06CalculoComDataHora;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaAnterior = d04.minusDays(7);
        LocalDate proximaSemana = d04.plusDays(7);
        LocalDate proximoAno = d04.plusYears(7);

        System.out.println("Alterando Semanas (LocalDate)");
        System.out.println("Semana atual: "+ d04);
        System.out.println("Semana anterior: " + semanaAnterior);
        System.out.println("Proxima semana: " + proximaSemana);
        System.out.println();
        System.out.println("Alterando ano (LocalDate)");
        System.out.println("Ano atual: " + d04);
        System.out.println("Proximo ano: " + proximoAno);


        System.out.println();
        System.out.println();

        LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d05.plusDays(7);

        System.out.println("Alterando Semanas (LocalDateTime)");
        System.out.println("Semana atual: " + d05);
        System.out.println("Semana anterior: " + semanaAnteriorLocalDateTime);
        System.out.println("Proxima semana: " + proximaSemanaLocalDateTime);


        System.out.println();
        System.out.println();



        Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Alterando Semanas (Instant)");
        System.out.println("Semana atual: " + d06);
        System.out.println("Semana anterior: " + semanaAnteriorInstant);
        System.out.println("Proxima semana: " + proximaSemanaInstant);

        System.out.println();
        System.out.println();

        Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(semanaAnteriorLocalDateTime, d05);
        Duration t3 = Duration.between(semanaAnteriorInstant, d06);

        System.out.println("Duracao LocalDate");
        System.out.println("T1 dias = " + t1.toDays());
        System.out.println();
        System.out.println("Duração LocalDateTime");
        System.out.println("T2 dias = " + t2.toDays());
        System.out.println();
        System.out.println("Duração Instant");
        System.out.println("T3 dias = " + t3.toDays());






    }
}
