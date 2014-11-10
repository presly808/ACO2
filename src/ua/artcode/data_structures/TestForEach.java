package ua.artcode.data_structures;

/**
 * Created by admin on 09.11.2014.
 */
public class TestForEach {

    public static void main(String[] args) {

        int[] mas = {1,2,3,4,5,6,7};
        for(int i : mas){
            System.out.print(i + " ");
        }

        String[] names = {"Pasha", "Bodia", "Dima", "Sasha", "Gleb"};
        for(String buff : names){
            System.out.print(buff +  "->");
        }

    }
}
