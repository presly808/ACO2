package ua.artcode.week6.serial;

import java.io.Serializable;

public class PlaneGarage implements Serializable {

    private int id;
    private int size;
    private String desc;

    public PlaneGarage(int id, int size, String desc) {
        this.id = id;
        this.size = size;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PlaneGarage{" +
                "id=" + id +
                ", size=" + size +
                ", desc='" + desc + '\'' +
                '}';
    }
}
