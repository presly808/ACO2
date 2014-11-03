package ua.artcode.week4.day1.abst;

import ua.artcode.week4.day1.Airplane;

public abstract class Figure {

    private String name;
    private double square;

    protected Figure(String name, double square) {
        this.name = name;
        this.square = square;
    }

    protected Figure() {
    }

    public abstract double evalSquare();

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
