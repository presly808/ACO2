package ua.artcode.sort;

/**
 * Created by admin on 19.10.2014.
 */
public class SelectionSort {

    public static void sort(int[] mas){
        for(int i = 0; i < mas.length; i++){
            int min = mas[i];
            int minJ = i;
            for(int j = i + 1; j < mas.length; j++){
                if(mas[j] < min){
                    min = mas[j];
                    minJ = j;
                }
            }
            swap(mas, i, minJ);
        }
    }



    public static void swap(int[] mas, int aI, int bI){
        int temp = mas[aI];
        mas[aI] = mas[bI];
        mas[bI] = temp;
    }

}
