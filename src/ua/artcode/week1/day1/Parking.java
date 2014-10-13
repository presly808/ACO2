package ua.artcode.week1.day1;

public class Parking {

    Motorcycle[] places = new Motorcycle[10];
    int parkingMan; // see at free last place

    //TODO add validation of arr ranges
    public void addMoto(Motorcycle motorcycle){
        places[parkingMan] = motorcycle;
        parkingMan++;
    }

    //TODO add validation of arr ranges
    public Motorcycle takeLastMoto(){
        parkingMan--;
        Motorcycle temp = places[parkingMan];
        places[parkingMan] = null;
        return temp;
    }

    public void showAll(){
        for(int i = 0; i < parkingMan; i++){
            places[i].go();
        }
    }



}
