package ua.artcode.data_structures;

/**
 * Created by admin on 02.11.2014.
 */
public class TestMyStack {


    public static void main(String[] args) {
        IStack stack = new MyArrayStack(10);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
