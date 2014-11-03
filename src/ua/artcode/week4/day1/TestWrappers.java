package ua.artcode.week4.day1;

/**
 * Created by admin on 01.11.2014.
 */
public class TestWrappers {

    public static void main(String[] args) {
        //
        /*
        * byte - Byte
        * short - Short
        * int - Integer
        * long - Long
        * float - Float
        * double - Double
        * boolean - Boolean
        * char - Character
        * */

        // Autoboxing Integer.valueOf(6);
        Object a1 = 12;
        Object a2 = 126;
        System.out.println(a1 == a2);

        Integer i1 = 45;
        Integer i2 = 89;

        // Unboxing a1.intValue() + a2.intValue();
        int res = i1 - 23 * i2 + 45;


    }
}
