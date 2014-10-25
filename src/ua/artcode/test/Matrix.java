package ua.artcode.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 14.10.2014.
 */
public class Matrix {

    public static int[][] mul(int[][] mat1, int[][] mat2){

        if(mat1[0].length != mat2.length){
            System.err.println("Can not multiply matrix ");
            return null;
        }

        int[][] res = new int[mat1.length][mat2[0].length];

        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i].length; j++){
                int temp = 0;
                for(int k = 0; k < res[i].length; k++){
                    temp += mat1[i][k] * mat2[k][j];
                }
                res[i][j] = temp;
            }
        }

        return res;
    }

    public static void printMatrix(int n){
        StringBuilder sb = new StringBuilder(n*2);
        int size = 2*n - 1;
        int midPos = n - 1;
        int count = 1;
        for(int i = 0; i < size; i++){
            int lRange = midPos - (count - 1);
            int rRange = midPos + (count - 1);
            int tempCount = 1;
            for (int j = 0; j < size; j++) {
                if(lRange <= j && j < midPos){
                    sb.append(tempCount++);
                }else if(j == midPos){
                    sb.append(count);
                } else if (midPos < j && j <= rRange){
                    sb.append(--tempCount);
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
            count = i < (size / 2) ? count+1 : count-1;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] mat2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] res = mul(mat1,mat2);
        System.out.println(Arrays.deepToString(res));

        printMatrix(4);



    }


}
