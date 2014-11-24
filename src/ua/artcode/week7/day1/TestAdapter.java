package ua.artcode.week7.day1;

import ua.artcode.week7.day1.adapter.ModerCar;
import ua.artcode.week7.day1.adapter.OldCar;
import ua.artcode.week7.day1.adapter.OldCarAdapter;
import ua.artcode.week7.day1.adapter.Race;

/**
 * Created by admin on 22.11.2014.
 */
public class TestAdapter {


    public static void main(String[] args) {
        OldCar oldCar = new OldCar();
        ModerCar moderCar = new ModerCar();

        Race race = new Race(moderCar);
        race.startRace();

        OldCarAdapter adapter = new OldCarAdapter(oldCar);
        Race race1 = new Race(adapter);
        race1.startRace();

    }
}
