package ua.artcode.week4.day1.abst;

/**
 * Created by admin on 01.11.2014.
 */
public class TestAbstract {

    public static void main(String[] args) {
        //Figure f3 = new Figure();
        Figure f1 = new Circle("circle", 45);
        Figure f2 = new Square("square", 22);
        double s1 = f1.evalSquare();
        double s2 = f2.evalSquare();
        System.out.println("square " + s1);
    }
}
