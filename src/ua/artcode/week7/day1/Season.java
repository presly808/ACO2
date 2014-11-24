package ua.artcode.week7.day1;


public enum Season { // extends Enum
    // static final Season WINTER = new Season();

    WINTER(30, -10), SPRING(90, 15), SUMMER(120, 30), AUTUMN(30, 10);

    private final int days;
    private final double temperature;

    private Season(int days, double temperature) {
        this.days = days;
        this.temperature = temperature;
    }

    public int getDays(){
        return days;
    }

    public double getTemperature(){
        return temperature;
    }



}
