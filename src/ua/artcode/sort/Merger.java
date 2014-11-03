package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by admin on 02.11.2014.
 */
public class Merger {


    public static int[] merge(int[] a1, int[] a2){
        int[] res = new int[a1.length + a2.length];
        int i = 0, j = 0;

        for(int k = 0; k < res.length; k++){
            if(i >= a1.length){
                res[k] = a2[j++];
            } else if(j >= a2.length){
                res[k] = a1[i++];
            } else if(a1[i] < a2[j]){
                res[k] = a1[i++];
            } else {
                res[k] = a2[j++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] mas1 = {1,6,78,223};
        int[] mas2 = {56,78,88,99,678};
        System.out.println(Arrays.toString(merge(mas1, mas2)));
        long val = (long) Math.pow(2, 1000);
        System.out.println(val);
    }


}
