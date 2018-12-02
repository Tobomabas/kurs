package pl.com.tkarolczyk.date_and_time.old_way;

import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExample {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);
        Date nowAgain = new Date(932242424L);
        System.out.println(nowAgain);
        Calendar calendar = Calendar.getInstance();

        System.out.println("calendar" + calendar);
        //calendar.add(Calendar.DAY_OF_MONTH, -1);
        //System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());




    }
}
