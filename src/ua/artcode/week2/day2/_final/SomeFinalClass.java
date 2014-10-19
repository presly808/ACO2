package ua.artcode.week2.day2._final;

/**
 * Created by admin on 19.10.2014.
 */
public class SomeFinalClass {

    private final int range;
    private final Man man = new Man();

    public SomeFinalClass() {
        range = 9;
    }

    public SomeFinalClass(int range) {
        this.range = range;
    }

    public void test(){
        // man = new Man();
        man.age = 78;
    }



}

class Man {

    public String name;
    public int age;

}
