package ua.artcode.week5.day1.gen;

/**
 * Created by admin on 08.11.2014.
 */
public class GenClass<T> {

    private T some;

    public GenClass() {

    }

    public GenClass(T some) {
        this.some = some;
    }

    public T getSome() {
        return some;
    }

    public void setSome(T some) {
        this.some = some;
    }


}
