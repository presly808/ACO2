package ua.artcode.week2.day1.encaps;

/**
 * Created by admin on 18.10.2014.
 */
public class Room {

    private int square;
    private String name;
    private double rentPrice;
    private double height;

    public Room(){
        System.out.println("default constructor");
    }

    public Room(int square, String name, double rentPrice,
                double height){
        System.out.println("overloaded constructor");
        this.square = square;
        this.name = name;
        this.rentPrice = rentPrice;
        this.height = height;
    }

    public Room(String name) {
        this.name = name;
    }

    public void setSquare(int square){
        this.square = square;
    }

    public int getSquare(){
        return square;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}