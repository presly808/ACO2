package ua.artcode.week1.day1;

//fields and methods
public class Garage {

    boolean closed;
    Motorcycle motorcycle;

    public void open() {
        closed = false;
    }

    public void close() {
        closed = true;
    }

    public boolean isClosed() {
        return closed;
    }

    public boolean hasMoto() {
        return motorcycle == null;
    }

    public void setMotorcycle(Motorcycle moto) {
        if (closed) {
            System.out.println("Get away, garage is closed");
        } else {
            motorcycle = moto;
        }
    }

    public Motorcycle getMotorcycle() {
        if (closed) {
            System.out.printf("Garage is closed");
            return null;
        }

        if (!hasMoto()) {
            System.out.println("Garage is empty");
            return null;
        }

        return motorcycle;
    }

}
