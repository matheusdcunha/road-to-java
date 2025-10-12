package dev.matheusdcunha.javacore.classesUtilitarias.date;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Instant inicioPrograma = Instant.now();
        Date date = new Date();

        Locale br = new Locale("pt", "BR");
        Locale us = new Locale("us", "US");
        Locale fr = Locale.FRENCH;



        SimpleDateFormat simpleDateFormatBR = new SimpleDateFormat("dd/MM/yyyy", br);

        DateFormat dateFormatUS = DateFormat.getDateInstance(DateFormat.LONG, us);
        DateFormat dateFormatBR = DateFormat.getDateInstance(DateFormat.LONG, br);
        DateFormat dateFormatFR = DateFormat.getDateInstance(DateFormat.LONG, fr);

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(us);
        NumberFormat numberFormatBR = NumberFormat.getCurrencyInstance(br);
        NumberFormat numberFormatFR = NumberFormat.getCurrencyInstance(fr);

        LocalTime time = LocalTime.now();


        System.out.println(dateFormatBR.format(date));
        System.out.println(dateFormatFR.format(date));

        System.out.println("-----");

        System.out.println(numberFormatUS.format(212));
        System.out.println(numberFormatBR.format(212));
        System.out.println(numberFormatFR.format(212));

        System.out.println("-----");

        System.out.println(time.minusHours(2));
        System.out.println(dateFormatUS.format(date));




        Instant fimPrograma = Instant.now();
        long duracaoPrograma = ChronoUnit.SECONDS.between(inicioPrograma, fimPrograma);
        System.out.println(duracaoPrograma);
    }
}
