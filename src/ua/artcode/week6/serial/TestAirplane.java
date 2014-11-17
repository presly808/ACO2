package ua.artcode.week6.serial;

import java.io.*;

/**
 * Created by admin on 16.11.2014.
 */
public class TestAirplane {


    public static final String PATH = "temp/airplane";

    public static void main(String[] args) {
        PlaneGarage planeGarage = new PlaneGarage(12,4,"default");
        Airplane airplane = new Airplane("AN-75", 120_000, planeGarage);
        serialize(PATH, airplane);

        Airplane airplane1 = (Airplane) deserialize(PATH);
        System.out.println(airplane1);
        //Object mas = new Object[12];

    }

    public static void serialize(String path, Object o){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Object deserialize(String path){
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
