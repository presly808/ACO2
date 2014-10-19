package ua.artcode.week2.day2._final;

/**
 * Created by admin on 19.10.2014.
 */
public class TestImmutable {


    public static void main(String[] args) {
        ImmutableCl immutableCl =
                new ImmutableCl(new char[]{'a', 'b', 'c'}, "My chars");
        char[] chars = immutableCl.getValue();

        String some = new String("Some text");

        for (int i = 0; i < 10; i++) {
            some = some + i;
        }
    }
}
