package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
  /*      Conceitos importantes
                • Data-[hora] local:
        ano-mês-dia-[hora] sem fuso horário
                [hora] opcional • Data-hora global:
        ano-mês-dia-hora com fuso horário
                • Duração:
        tempo decorrido entre duas data-horas
        */

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now(); // Apenas data
        LocalDateTime d02 = LocalDateTime.now();  // Data e hora local
        Instant d03 = Instant.now(); //Data hora GTM

        LocalDate d04 = LocalDate.parse("2024-08-30");
        LocalDate d05 = LocalDate.parse("20/08/2024", fmt1);
        LocalDate d06 = LocalDate.of(2024, 8, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06.toString());

    }
}
