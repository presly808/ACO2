package ua.artcode.week4.day1;

import java.util.Date;

/**
 * Created by admin on 01.11.2014.
 */
public class TestEquals {


    public static void main(String[] args) {
        Date d = new Date();
        Airplane a1 = new Airplane(123,"An", 300000, d);
        Airplane a2 = new Airplane(123,"An", 300000, d);


        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a1.equals(a2) " + a1.equals(a2));


    }
}
