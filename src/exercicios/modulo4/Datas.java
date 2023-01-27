package exercicios.modulo4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        Double valor = 64000d;
        LocalDate now = LocalDate.now();
        LocalDate dataUltimaParcela = now.plusMonths(48);
        Double parcela = valor / 48;

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(dataUltimaParcela.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        for (int i = 0; i < 48; i++) {
            LocalDate data = now.plusMonths(i);
            System.out.println((i+1) + "A parcela é de R$" + parcela + " e a data da parcela é: " + data.plusMonths(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        }


    }
}
