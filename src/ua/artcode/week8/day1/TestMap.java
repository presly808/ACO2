package ua.artcode.week8.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Oleg");
        map.put(12, "Serhii");
        map.put(11, "Vasia");

        System.out.println("Only keys");
        for(Integer key : map.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println("\nOnly values");

        for(String val : map.values()){
            System.out.print(val + ", ");
        }

        System.out.println("\ngetValue output");

        for(Integer key : map.keySet()){
            System.out.print("key : " + key + " value : " + map.get(key) + ",");
        }
        System.out.println("\nEntry output");

        Set<Map.Entry<Integer, String>> setEntry =  map.entrySet();
        for(Map.Entry<Integer, String> entry : setEntry){
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());

        }


    }

}
