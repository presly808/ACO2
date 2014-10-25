package ua.artcode.test;

/**
 * Created by admin on 24.10.2014.
 */
public class Functional {

    public static int length(Node tail) {
        return tail == null ? 0 : 1 + length(tail.getNext());
    }

    public static boolean isGrowing(Node tail, Comparable comparable) {
        if (tail == null) {
            return true;
        }
        return comparable.compareTo(tail.getElement()) <= 0 && isGrowing(tail.getNext(), tail.getElement());

    }


}
