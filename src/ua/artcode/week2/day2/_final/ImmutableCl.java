package ua.artcode.week2.day2._final;

import java.util.Arrays;

/**
 * Created by admin on 19.10.2014.
 */
public final class ImmutableCl {

    private final char[] value;

    private final String desc;

    public ImmutableCl() {
        this(new char[10], "Default"); // call overloaded constr
    }

    public ImmutableCl(char[] value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public char[] getValue(){
        char[] copy = new char[value.length];
        for(int i = 0; i < copy.length; i++){
            copy[i] = value[i];
        }
        return copy;
    }


}
