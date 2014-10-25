package ua.artcode.week3.day1.inher;

public class Worker  {

    private String name;
    private int age;
    private double salary;

    public Worker() {
        super(); // superclass Object
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Worker: name = " + name +
                " age = " + age +
                " salary = " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Worker: name = " + name +
                " age = " + age +
                " salary = " + salary;
    }
}
