package ua.artcode.week7.day1.adapter;

public class Race {

    private ModerCar car;

    public Race(ModerCar car) {
        this.car = car;
    }

    public void startRace(){
        car.goFast();
    }
}
