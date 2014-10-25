package ua.artcode.week3.day1.inher;

/**
 * Created by admin on 25.10.2014.
 */
public class Developer extends Worker {

    private String programmingLanguage = "Java";
    private String level = "Senior";

    public Developer(){
    }

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void testInher(){
        getProgrammingLanguage();
        level = "Middle";
        super.getAge();
        super.setSalary(2000);
    }

    public void work(){
        System.out.println("Dev is working");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
