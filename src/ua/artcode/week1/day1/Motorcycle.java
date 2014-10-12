package ua.artcode.week1.day1;

/**
 * Created by admin on 11.10.2014.
 */
//SHIFT + F6
public class Motorcycle {

    //default value
    String model = "Java";//null
    int speed = 60;//0
    double price = 5000;//0.0

    // String + int
    public void go(){
        int goVar = 99;
        System.out.println("Model : " + model + " speed : " + speed + " price : " + price);
    }

    public void test(){
        int a = 8;
        if(a < 10){
            for(int i = 10; --i > 0;){
                int b = 9;
                if(true){
                    a++;
                    int c = 10;
                }
            }
        }



    }

}
