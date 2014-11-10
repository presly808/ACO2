package ua.artcode.week5.day2.inn;

import java.util.ArrayList;
import java.util.Comparator;

//outer class
public class Flat implements Comparable<Flat> {

    private ArrayList<Room> rooms = new ArrayList<>();
    private int floor;
    private int num;
    private static int size;

    public void createRoom(double square, double height){
        rooms.add(new Room(square,height));
    }

    @Override
    public int compareTo(Flat o) {
        return this.num - o.num;
    }

    // Inner class - inner object depends on outer object
    public class Room {
        double square;
        double height;

        public Room(double square, double height) {
            this.square = square;
            this.height = height;
        }
        private void test(){

        }
    }

    //nested independent from outer class
    public static class Window {
        public void t(){

        }
    }


    public static class FlatFloorComparator implements Comparator<Flat> {

        @Override
        public int compare(Flat o1, Flat o2) {
            return o1.floor - o2.floor;
        }
    }

}
