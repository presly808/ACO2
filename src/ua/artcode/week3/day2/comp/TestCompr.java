package ua.artcode.week3.day2.comp;

import java.util.Arrays;

/**
 * Created by admin on 26.10.2014.
 */
public class TestCompr {

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Lion", 8, 9000, 100);
        cats[1] = new Cat("Jack", 3, 100, 5);
        cats[2] = new Cat("Mursik", 1, 300, 3);
        cats[3] = new Cat("Bonia", 9, 200, 10);

        System.out.println("BEFORE SORTING");
        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats);
        //MySorter.sort(cats);

        System.out.println("AFTER SORTING");
        System.out.println(Arrays.toString(cats));
    }

}
