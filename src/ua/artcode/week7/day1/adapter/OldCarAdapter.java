package ua.artcode.week7.day1.adapter;

/**
 * Created by admin on 22.11.2014.
 */
public class OldCarAdapter extends ModerCar {

    private OldCar oldCar;

    public OldCarAdapter(OldCar oldCar) {
        this.oldCar = oldCar;
    }

    @Override
    public void goFast() {
        oldCar.go();
    }
}
