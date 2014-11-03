package ua.artcode.week4.day1;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by admin on 01.11.2014.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        //TODO GregorianCalendar gregorianCalendar
        for (int i = 0; i < 100; i++) {
            Math.sin(2.76);
        }

        //get nanotime
        long nanos = System.nanoTime();

        //get millis
        long millis = System.currentTimeMillis();
        Date date2 = new Date(millis);

        System.out.println(date1.getTime() + " - " + date2.getTime());
        System.out.println(date1 + "  -  " + date2);
        System.out.println("date1.equals(date2) " + date1.equals(date2));

    }


}
