package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by admin on 19.10.2014.
 */
public class TestSelectionSort {

    public static void main(String[] args) {
        int[] mas = {76,12,4,1,9,87,1,34};
        System.out.println(Arrays.toString(mas));
        SelectionSort.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
