package ua.artcode.week6.ex;

/**
 * Created by admin on 15.11.2014.
 */
public class TestExampExceptions {

    public static void main(String[] args) {
        System.out.println("Before");
        int[] mas = {1,2,3,5};
        a();
        System.out.println("After");
    }

    public static void a(){
        b();
    }

    public static void b(){
        int[] mas = {};
        int res = mas[1];
    }

}
