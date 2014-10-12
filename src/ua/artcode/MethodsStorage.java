package ua.artcode;

/**
 * Created by admin on 11.10.2014.
 */
public class MethodsStorage {

    // 5, 2, 3, 4, 1
    // 1
    public static void reverseArr(int[] mas){
        for(int i = 0; i < (mas.length / 2); i++){
            int lastPos = mas.length - i - 1;
            int temp = mas[i];
            mas[i] = mas[lastPos];
            mas[lastPos] = temp;
        }
    }


}
