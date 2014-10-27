package ua.artcode.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] mas){
        for(int i = 1, j = i; i < mas.length; i++){
            while(j >= 1 && mas[j-1] > mas[j]){
                SelectionSort.swap(mas, j-1, j);
                j--;
            }
        }
    }



    public static void main(String[] args) {
        int[] mas = {56,23,12,5,1,2,6};
        sort(mas);

        System.out.println(Arrays.toString(mas));
    }


}
