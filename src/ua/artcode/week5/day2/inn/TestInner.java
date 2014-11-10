package ua.artcode.week5.day2.inn;

/**
 * Created by admin on 09.11.2014.
 */
public class TestInner {


    public static void main(String[] args) {
        Flat flat = new Flat();
        //inner
        Flat.Room room = flat.new Room(22,2);

        //nested
        Flat.Window window = new Flat.Window();
    }
}
