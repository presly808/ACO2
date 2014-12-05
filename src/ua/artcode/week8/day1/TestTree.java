package ua.artcode.week8.day1;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Vasia");
        treeSet.add("Bogdan");
        treeSet.add("Olexiy");
        treeSet.add("Evgen");
        treeSet.add("Andriy");

        for(String name : treeSet){
            System.out.println(name);
        }
    }


}
