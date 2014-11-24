package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by admin on 22.11.2014.
 */
public class QuickSort {


    public static void sort(int[] mas) {
        sort(mas, 0, mas.length - 1);
    }

    public static void sort(int[] mas, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        int pivot = mas[mid];
        int i = start;
        int j = end;

        while (i < j) {

            while (mas[i] < pivot) {
                i++;
            }
            while (mas[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(mas, i, j);
                i++;
                j--;
            }

        }

        if (start < j)
            swap(mas, start, j);

        if (i < end)
            swap(mas, i, end);


    }

    private static void swap(int[] mas, int i, int j) {
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }

    public static void main(String[] args) {
        int[] mas = {5, 3, 2, 67, 2, 7, 23, 89, 23};
        sort(mas);
        System.out.println(Arrays.toString(mas));
    }

}
