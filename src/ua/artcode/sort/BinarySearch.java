package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by admin on 02.11.2014.
 */
public class BinarySearch {

    public static int search(int[] mas, int key){
        int start = 0, end = mas.length - 1;
        while (start <= end){ // exit condition
            int mid = start + (end - start) / 2;
            if(key < mas[mid]){
                end = mid - 1; // way
            } else if(key > mas[mid]){
                start = mid + 1; // way
            } else {
                return mid;
            }
        }
        return -1; // not found in array
    }

    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6,7,8,9};
        System.out.println(testBinary(mas));

    }

    //TODO check if empty array,
    public static boolean testBinary(int[] mas){
        boolean res = true;
        if(!(search(mas, mas[0]) == Arrays.binarySearch(mas,mas[0]))){
            res = false;
        }

        if(!(search(mas, mas[mas.length - 1]) ==
                Arrays.binarySearch(mas,mas[mas.length - 1]))){
            res = false;
        }

        if(!(search(mas, mas[mas.length/2]) == Arrays.binarySearch(mas,mas[mas.length/2]))){
            res = false;
        }

        if(!(search(mas, mas[mas.length/2]) == Arrays.binarySearch(mas,mas[mas.length/2]))){
            res = false;
        }

        return res;
    }



}
