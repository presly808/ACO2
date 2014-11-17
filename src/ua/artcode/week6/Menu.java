package ua.artcode.week6;

import java.util.Scanner;

/**
 * Created by admin on 16.11.2014.
 */
public class Menu {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int choose = -1;
        while (choose != 10) {
            show();
            choose = sc.nextInt();
        }



    }

    static void show() {
        System.out.println("1.go");
        System.out.println("10.exit");
    }
}
