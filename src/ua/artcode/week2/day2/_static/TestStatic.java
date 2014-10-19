package ua.artcode.week2.day2._static;

/**
 * Created by admin on 19.10.2014.
 */
public class TestStatic {

    public static void main(String[] args) {
        SomeStatic.doStatic();
        SomeStatic.count = 0;

        SomeStatic someStatic = new SomeStatic();
        someStatic.doNonStatic();

        // Arrays

    }

}
