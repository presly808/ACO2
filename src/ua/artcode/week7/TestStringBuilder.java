package ua.artcode.week7;

/**
 * Created by admin on 23.11.2014.
 */
public class TestStringBuilder {

    public static void main(String[] args) {
        concatStringBuilder(100000);
        concatString(100000);


    }


    public static void concatStringBuilder(int size){
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
        System.out.println("StringBuilder concat " + (System.currentTimeMillis() - start));
    }

    public static void concatString(int size){
        long start = System.currentTimeMillis();
        String res = "";
        for (int i = 0; i < size; i++) {
            res += i;
        }
        System.out.println("String concat " + (System.currentTimeMillis() - start));
    }
}
