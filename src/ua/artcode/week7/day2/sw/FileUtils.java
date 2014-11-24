package ua.artcode.week7.day2.sw;

import java.io.*;

/**
 * Created by admin on 23.11.2014.
 */
public class FileUtils {


    public static String load(String path){
        File file = new File(path);
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = "";
            while (line != null){
                line = bufferedReader.readLine();
                stringBuilder.append(line).append("\n");
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void save(String path, String text){
        try (PrintWriter writer = new PrintWriter(path)) {
            writer.println(text);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
