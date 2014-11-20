package ua.artcode.serial;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by admin on 20.11.2014.
 */
public class TestSerial {

    public static void main(String[] args) {
        Collection arr = new ArrayList();
        arr.add("Vova");
        arr.add("Andriy");
        arr.add("Olexiy");
        arr.add("Vania");

        new SerialSaver().save("serial.txt", arr);
    }
}
