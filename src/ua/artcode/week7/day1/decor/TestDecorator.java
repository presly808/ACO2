package ua.artcode.week7.day1.decor;

import java.io.*;
import java.util.Scanner;

/**
 * Created by admin on 22.11.2014.
 */
public class TestDecorator {


    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("homework/week2.txt"));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);

        for(;;){ // while(true)
            String readed = lineNumberReader.readLine();
            if(readed == null)
                break;
            System.out.println(readed);

        }
    }
}
