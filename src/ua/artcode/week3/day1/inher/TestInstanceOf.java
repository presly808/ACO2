package ua.artcode.week3.day1.inher;

/**
 * Created by admin on 25.10.2014.
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        Worker[] team = new Worker[3];
        team[0] = new Developer();
        team[1] = new Tester("Anton", 22, 1200, "QA");
        team[2] = new Worker();


        // int long
        int i = (int)12L;

        Worker w1 = team[0];
        if(w1 instanceof Developer){
            Developer d1 = (Developer) w1;
            System.out.println(d1.getLevel());
        }

        byte r = 0;// 00000111 - 11111000
        System.out.println(Integer.toBinaryString(r));
    }


}
