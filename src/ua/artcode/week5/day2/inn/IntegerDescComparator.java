package ua.artcode.week5.day2.inn;

import java.util.Comparator;

public class IntegerDescComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
