package ua.artcode.week5.day2.inn;

import ua.artcode.data_structures.IStack;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by admin on 09.11.2014.
 */
public class TestAnno {

    public IStack stack = new IStack() {
        @Override
        public void push(Object obj) {

        }

        @Override
        public Object pop() {
            return null;
        }
    };


    public static void main(String[] args) {
        Integer[] mas = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(mas));

        Arrays.sort(mas, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(mas));
    }
}


