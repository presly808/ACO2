package ua.artcode.week6.streams;

import java.io.*;

/**
 * Created by admin on 16.11.2014.
 */
public class StreamUtils {

    public static final String PATH_TO_FILE = "homework/week1.txt";
    public static final String PATH = "temp/data.txt";
    public static final String PATH_DATA = "temp/data1.txt";

    public static void main(String[] args) {
        /*String res= readInputStream(PATH_TO_FILE);
        System.out.println(res);*/

        /*String res1 = buffReading(PATH_TO_FILE, 20);
        System.out.println(res1);*/

        /*writeDataInputStream(PATH, "some data");


        String res3 = readRader(PATH_TO_FILE);
        System.out.println(res3);*/

        writeWriter(PATH_DATA, new String[]{"Доброго", "дня", "Вас вітає слжба лайф!"});

    }

    public static String buffReading(String path, int buffSize){
        String res = "";
        byte[] buff = new byte[buffSize];
        try {
            InputStream is = new FileInputStream(PATH_TO_FILE);
            int count = is.read(buff);
            while (count >= buff.length){
                res += new String(buff,0,count);
                count = is.read(buff);
            }
            res += new String(buff);
            is.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return res;
    }

    public static String readInputStream(String path){
        String res = "";
        try {
            InputStream is = new FileInputStream(PATH_TO_FILE);
            int read = -1;
            while((read = is.read()) != -1){
                res += (char)read;
            }
            is.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return res;
    }

    public static void writeDataInputStream(String path, String data){

        OutputStream os = null;
        try {
            os = new FileOutputStream(path);
            for(int i = 0; i < data.length(); i++){
                byte b = (byte) data.charAt(i);
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static String readRader(String path){
        String res = "";
        try {
            Reader reader = new FileReader(path);
            while(reader.ready()){
                res += (char)reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void writeWriter(String path, String[] src){
        // try - with - resource 1.7
        try (Writer writer = new FileWriter(path)){
            for(String word : src){
                writer.write(word);
            }
            //writer.flush(); // for part writing into file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
