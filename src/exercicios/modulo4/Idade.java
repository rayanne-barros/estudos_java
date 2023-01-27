package exercicios.modulo4;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Idade {

    public static void main(String[] args) {
       LocalDate dataNascimento = LocalDate.of(1995, Month.MARCH, 29);

        LocalDate now = LocalDate.now();

        System.out.println(dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        long idade = ChronoUnit.YEARS.between(dataNascimento, now);
        System.out.println("Idade: " + idade);
    }
}
