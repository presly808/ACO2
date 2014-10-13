package ua.artcode.week1.day1;

/**
 * Created by admin on 12.10.2014.
 */
public class TestParking {

    public static void main(String[] args) {
        Parking parking = new Parking();

        for (int i = 0; i < 10; i++) {
            parking.addMoto(new Motorcycle());
        }

        for (int i = 0; i < 3; i++) {
            parking.takeLastMoto();
        }

        parking.showAll();

    }

}
