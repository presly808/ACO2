package ua.artcode.week3.day1.inher;

/**
 * Created by admin on 25.10.2014.
 */
public class TestToString {

    public static void main(String[] args) {
        Developer developer =
                new Developer("Andriy", 25, 3000);
        System.out.println(developer);
        Tester tester1 = new Tester("Olexiy", 20, 1600, "QA");
        System.out.println(tester1);
        Tester tester2 = new Tester("Oleg", 24, 1000,"MANUAL");
        System.out.println(tester2);
    }

}
