package pl.com.tkarolczyk.date_and_time.new_way;

import sun.rmi.runtime.NewThreadAction;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDataAndTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

//        LocalTime piecMinutPrzed = localTime.minusMinutes(5);
//        System.out.println(piecMinutPrzed);


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
//        LocalDate grunwald = LocalDate.of(1410, 8, 15);
//        System.out.println(grunwald.getMonth());
//        LocalDate newDate = LocalDate.of
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

   System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/L/YYYY - hh:mm")));
   System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/L/YYYY - hh:mm")));


        System.out.println("/////////////////////////////////");

        Date maybeNow = new Date();

        long time = maybeNow.getTime();

        Instant instant = Instant.ofEpochMilli(time);

        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(maybeNowNewWay);




    }

}
