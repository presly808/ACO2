package ua.artcode.week2.day2;

/**
 * Created by admin on 19.10.2014.
 */
public class EqualsStringTest {

    public static void main(String[] args) {
        String s = "Vova";

        String s1 = new String("Vova");

        System.out.println("s1 == s " + (s1 == s));

        System.out.println("s1.equals(s) " + s1.equals(s));

        // Source code
        String str = "Some text";
        str.concat(s1); // str + s1
        String sub = str.substring(0, 4);
        System.out.println(sub);






    }



}
