package ua.artcode.week3.day2.comp;

/**
 * Created by admin on 26.10.2014.
 */
public class Cat implements Comparable {

    private String callName;
    private int age;
    private double price;
    private double food;

    public Cat() {
    }

    public Cat(String callName, int age, double price, double food) {
        this.callName = callName;
        this.age = age;
        this.price = price;
        this.food = food;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    @Override
    public int compareTo(Object o) {
        System.exit(1);
        Cat other = (Cat) o;

        if(this.food < other.food){
            return -1;
        } else if(this.food > other.food){
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "callName='" + callName + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", food=" + food +
                '}';
    }
}
