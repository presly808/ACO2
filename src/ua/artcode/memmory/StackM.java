package ua.artcode.memmory;

/**
 * Created by admin on 15.11.2014.
 */
public class StackM {


    public static void ran(int a){
        String ref = "some";
        int ran = (int) (Math.random() * 100);
        ran(ran);
    }

    public static void main(String[] args) {
        ran(45);
    }

}
