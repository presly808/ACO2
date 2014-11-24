package ua.artcode.week7.day1;

import ua.artcode.sort.MergeSort;
import ua.artcode.sort.SelectionSort;

import java.util.Arrays;

public class TestSorting {

    public static void main(String[] args) {
        int[] mas = genMas(100000);
        compare(mas);
    }

    public static int[] genMas(int size){
        int[] mas = new int[size];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * 100);
        }
        return mas;
    }


    public static void compare(int[] mas){
        int[] copy1 = Arrays.copyOf(mas,mas.length);

        long start1 = System.currentTimeMillis();
        SelectionSort.sort(copy1);
        long end1 = System.currentTimeMillis();
        System.out.println("Selection sort time " + (end1 - start1));


        long start2 = System.currentTimeMillis();
        new MergeSort().sort(mas);
        long end2 = System.currentTimeMillis();
        System.out.println("Merge sort time " + (end2 - start2));

    }

}
