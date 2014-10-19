package ua.artcode.week1.day1;

/**
 * Created by admin on 18.10.2014.
 */
public class Biker {

    double cash = 10000;
    Motorcycle motorcycle = null;
    Address address;

    public void buyMoto(Motorcycle moto){
        motorcycle = moto;
        cash -= moto.price;//cash = cash - moto.price
    }


    public void fix(){
        motorcycle.fixed = true;
    }


}
