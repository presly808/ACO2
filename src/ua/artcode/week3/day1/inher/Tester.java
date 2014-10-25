package ua.artcode.week3.day1.inher;

/**
 * Created by admin on 25.10.2014.
 */
public class Tester extends Worker {

    private String type = "QA";

    public Tester(String name, int age,
                  double salary, String type) {
        super(name, age, salary);
        this.type = type;
    }

    public void work(){
        System.out.println("Tester is working");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
