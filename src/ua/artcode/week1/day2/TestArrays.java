package ua.artcode.week1.day2;

import ua.artcode.week1.day1.Motorcycle;

/**
 * Created by admin on 12.10.2014.
 */
public class TestArrays{

    public static void main(String[] args) {
        Motorcycle[] motos = new Motorcycle[3];
        for(int i = 1; i < motos.length; i++){
            motos[i] = new Motorcycle();
        }

        // null.go();
        motos[0].go();

    }


}
