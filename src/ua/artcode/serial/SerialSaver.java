package ua.artcode.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;

/**
 * Created by admin on 20.11.2014.
 */
public class SerialSaver implements ISaver {

    @Override
    public void save(String path, Collection e) {
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(e);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Collection load(String path) {
        return null;
    }
}
