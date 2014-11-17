package ua.artcode.week6.ex;

/**
 * Created by admin on 15.11.2014.
 */
public class Checker {

    public static boolean check(String name) throws ParseNameException {
        for(char c : name.toCharArray()){
            if(!Character.isLetter(c)){
                throw new ParseNameException("Invalid name : " + name + ", use only letters");
            }
        }
        return true;
    }

}
