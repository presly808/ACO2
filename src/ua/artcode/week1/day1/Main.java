package ua.artcode.week1.day1;

//import java.lang.*;

import ua.artcode.MethodsStorage;

import java.util.Arrays;

/**
 * Created by admin on 11.10.2014.
 */
public class Main {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        MethodsStorage.reverseArr(arr);

        String stringArr = Arrays.toString(arr);
        System.out.println(stringArr);

    }

    public static void doSome(){
        System.out.println("Some");
    }

}
