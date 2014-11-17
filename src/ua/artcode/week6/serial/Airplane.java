package ua.artcode.week6.serial;

import java.io.Serializable;

public class Airplane implements Serializable {

    private String model;
    private double weight;
    private PlaneGarage garage; // see transient word

    public Airplane() {
    }

    public Airplane(String model, double weight, PlaneGarage garage) {
        this.model = model;
        this.weight = weight;
        this.garage = garage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public PlaneGarage getGarage() {
        return garage;
    }

    public void setGarage(PlaneGarage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", garage=" + garage +
                '}';
    }
}
