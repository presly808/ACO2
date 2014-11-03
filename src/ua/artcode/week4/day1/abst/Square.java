package ua.artcode.week4.day1.abst;

/**
 * Created by admin on 01.11.2014.
 */
public class Square extends Figure {

    private double side;

    public Square(String name, double side) {
        super(name, 0);
        this.side = side;
    }

    @Override
    public double evalSquare() {
        return Math.pow(side,2);
    }
}
