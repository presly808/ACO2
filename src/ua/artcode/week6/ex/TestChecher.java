package ua.artcode.week6.ex;

import java.util.Scanner;

/**
 * Created by admin on 15.11.2014.
 */
public class TestChecher {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Input name");
                String name = sc.next();
                Checker.check(name);
                break;
            } catch (ParseNameException e) {
                System.err.println(e.getMessage());
                System.out.println("try again");
            }
        }

    }

}
