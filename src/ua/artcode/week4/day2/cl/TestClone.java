package ua.artcode.week4.day2.cl;

import ua.artcode.week4.day1.Airplane;

import java.util.Date;

/**
 * Created by admin on 02.11.2014.
 */
public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Airplane air1 = new Airplane(234, "AN", 400000, new Date());
        System.out.println(air1);
        Airplane cloned = air1.clone();
        cloned.setNum(456);
        cloned.setModel("AN_NEW");
        cloned.getCreationDate().setHours(11);
    }
}
