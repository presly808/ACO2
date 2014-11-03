package ua.artcode.week4.day1;

import java.util.Date;

public class Airplane implements Cloneable {

    private int num;
    private String model;
    private double price;
    private Date creationDate;

    public Airplane() {
    }

    public Airplane(int num, String model,
                    double price, Date creationDate) {
        this.num = num;
        this.model = model;
        this.price = price;
        this.creationDate = creationDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "num=" + num +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(obj.getClass() != Airplane.class){
            return false;
        }

        Airplane other = (Airplane) obj;

        if(this.num == other.num &&
                this.price == other.price &&
                (this.model != null && this.model.equals(other.model)) &&
                (this.creationDate != null &&
                        this.creationDate.equals(other.creationDate))){
            return true;
        }

        return false;
    }

    @Override
    public Airplane clone() throws CloneNotSupportedException {
        // clone all primitives and create new airplane
        Airplane cloned = (Airplane) super.clone();

        //deep cloning
        cloned.creationDate = (Date) this.creationDate.clone();
        cloned.model = new String(this.model);

        return cloned;
    }


}