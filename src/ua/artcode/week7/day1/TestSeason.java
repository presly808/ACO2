package ua.artcode.week7.day1;


public class TestSeason {

    public static void main(String[] args) {
        Season sum = Season.valueOf("SUMMER");
        String name = sum.name();
        int order = sum.ordinal();
        System.out.println(name + " : " + order);

        Season spr = Season.SPRING;
        Season[] seasons = Season.values();
        for(Season s : seasons){
            s.getDays();
            s.getTemperature();
        }

    }


}
