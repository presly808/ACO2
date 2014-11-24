package ua.artcode.week7.day1.decor;

/**
 * Created by admin on 22.11.2014.
 */
public class TestFilter {


    public static void main(String[] args) {

        DataInputStreamFilter filter = new DataInputStreamFilter(System.in);
        System.out.println("Input some");
        System.out.println(filter.next());
    }
}
