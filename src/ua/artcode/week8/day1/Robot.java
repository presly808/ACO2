package ua.artcode.week8.day1;

import java.util.Date;

public class Robot {

    private int energy;
    private String model;
    private Date creation;
    private double price;
    private long wayCount;

    public Robot() {
    }

    public Robot(int energy, String model, Date creation,
                 double price, long wayCount) {
        this.energy = energy;
        this.model = model;
        this.creation = creation;
        this.price = price;
        this.wayCount = wayCount;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getWayCount() {
        return wayCount;
    }

    public void setWayCount(long wayCount) {
        this.wayCount = wayCount;
    }


    //contract  (a1.equals(a2) => (a1.hashCode() == a2.hashCode)


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot robot = (Robot) o;

        if (energy != robot.energy) return false;
        if (Double.compare(robot.price, price) != 0) return false;
        if (wayCount != robot.wayCount) return false;
        if (creation != null ? !creation.equals(robot.creation) : robot.creation != null) return false;
        if (model != null ? !model.equals(robot.model) : robot.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + energy;
        hash = 31 * hash + (model != null ? model.hashCode() : 0);
        hash = 31 * hash + (creation != null ? creation.hashCode() : 0);
        hash = 31 * hash + (int)(wayCount ^ (wayCount >>> 32));
        hash = 31 * hash + (int)(Double.doubleToLongBits(price) >>> 32);
        return hash;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "energy=" + energy +
                ", model='" + model + '\'' +
                ", creation=" + creation +
                ", price=" + price +
                ", wayCount=" + wayCount +
                '}';
    }
}
