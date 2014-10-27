package ua.artcode.week3.day2.comp;

/**
 * Created by admin on 26.10.2014.
 */
public class MySorter {

    // BubbleSort
    public static void sort(Comparable[] mas){
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length - 1 - i; j++){
                if(mas[j].compareTo(mas[j+1]) > 0){
                    swap(mas, j, j+1);
                }
            }
        }
    }

    public static void swap(Object[] mas, int i, int j){
        Object temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }

    public static Comparable getSmaller(Comparable one, Comparable second){
        if(one.compareTo(second) < 0){
            return one;
        } else {
            return second;
        }
    }

}
