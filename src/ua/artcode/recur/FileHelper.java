package ua.artcode.recur;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FileHelper {

    public static List<String> findRecUp(File root, String key){

        if(root.isFile()){
            return root.getName().contains(key) ? Arrays.asList(root.getAbsolutePath()) : null;
        }

        File[] files = root.listFiles();
        List<String> paths = new LinkedList<>();
        for(File file : files){
            List<String> returnedList = findRecUp(file, key);
            if(returnedList != null && !returnedList.isEmpty()){
                paths.addAll(returnedList);
            }
        }

        return paths;

    }


    public static void find(File root, String key){

        if(!root.isDirectory()){
            return;
        }

        File[] files = root.listFiles();
        for(File curr : files){
            if(!curr.isDirectory()){
                if (curr.getName().contains(key)){
                    System.out.println(curr.getAbsolutePath());
                }
            } else {
                 find(curr, key);
            }
        }
    }

    public static void main(String[] args) {
        List<String> res = findRecUp(new File("e:/soft"), "jdk");
        for(String path : res){
            System.out.println(path);
        }
    }

}
