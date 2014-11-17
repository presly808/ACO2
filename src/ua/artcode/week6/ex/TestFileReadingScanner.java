package ua.artcode.week6.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileReadingScanner {

    public static void main(String[] args) {
        File file = new File("f:/test.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
