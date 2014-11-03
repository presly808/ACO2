package ua.artcode.week4.day1;

import java.util.ArrayList;

/**
 * Created by admin on 01.11.2014.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // no generics
        ArrayList al = new ArrayList();
        al.add(45);
        al.add(56);

        Object i1 = al.get(0);
        Object i2 = al.get(1);

        boolean b = al.isEmpty();
        al.size();
        //al.clear();
        al.remove(45);

        al.set(0, 78);
        Object[] o = al.toArray();


        // with generics
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Oleg");
        String name = al2.get(0);



    }

}
