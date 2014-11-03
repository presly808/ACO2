package ua.artcode.week4.day1.abst;

/**
 * Created by admin on 01.11.2014.
 */
public class Circle extends Figure {

    private double radius;

    public Circle(String name, double radius) {
        super(name, 0);
        this.radius = radius;
    }

    @Override
    public double evalSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
