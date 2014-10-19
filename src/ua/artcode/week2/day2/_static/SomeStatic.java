package ua.artcode.week2.day2._static;

/**
 * Created by admin on 19.10.2014.
 */
public class SomeStatic {

    static int count;
    static String desc;

    double sum;
    char aChar;

    public void doNonStatic(){
        sum++;
        count++;
    }

    public static void doStatic(){
        count++;
        desc = "name";
        //sum++;
    }

}
