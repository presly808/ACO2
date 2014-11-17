package ua.artcode.week6.ex;

import java.io.File;
import java.io.IOException;

public class FileTestEx {

    public static void main(String[] args) {

        try {
            testTrowChecked();
        } catch (Exception e){
            System.out.println("In catch");
        }

        System.out.println("After try");

    }

    public static void testTrow(boolean c) {
        if (c) {
            throw new RuntimeException();
        }
        System.out.println("After if");
    }

    public static void testTrowChecked() throws Exception {
        throw new Exception();

    }

}
