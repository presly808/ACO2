package ua.artcode.week8.day1;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestHash {

    public static void main(String[] args) {
        Set<Robot> hashSet = new HashSet<>();


        Date creation = new Date();

        hashSet.add(new Robot(100, "EN-10", creation, 1000, 0));
        hashSet.add(new Robot(100, "EN-45", creation, 10000, 0));
        hashSet.add(new Robot(100, "EN-78", creation, 1021, 50));
        hashSet.add(new Robot(100, "EN-45", creation, 10000, 0));


        for(Robot r : hashSet){
            System.out.println(r);
        }


        System.out.println(hashSet.size());
    }


}
