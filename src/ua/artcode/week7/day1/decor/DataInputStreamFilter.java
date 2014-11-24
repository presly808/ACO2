package ua.artcode.week7.day1.decor;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by admin on 22.11.2014.
 */
public class DataInputStreamFilter extends FilterInputStream {

    public DataInputStreamFilter(InputStream in) {
        super(in);
    }

    public String next(){
        String res = "";

        char read = ' ';
        try {
            while((read = (char) super.in.read()) != ' '){
                res += read;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
