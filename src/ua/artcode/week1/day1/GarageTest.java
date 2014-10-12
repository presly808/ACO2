package ua.artcode.week1.day1;

/**
 * Created by admin on 12.10.2014.
 */
public class GarageTest {

    public static void main(String[] args) {
        Motorcycle motorcycle =
                new Motorcycle();
        Garage garage = new Garage();
        System.out.println(garage.isClosed());
        garage.open();
        garage.setMotorcycle(motorcycle);
        garage.motorcycle = motorcycle;

    }

}
