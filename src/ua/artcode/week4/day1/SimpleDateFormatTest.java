package ua.artcode.week4.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 01.11.2014.
 */
public class SimpleDateFormatTest {


    public static void main(String[] args) throws ParseException{
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String res = sdf.format(d);
        System.out.println(res);

        String strDate = "1998-11-24 19:34";
        Date parsed = sdf.parse(strDate);
        System.out.println("parsed = " + parsed);


    }



}
