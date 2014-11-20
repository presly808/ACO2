package ua.artcode.serial;

import java.util.Collection;

/**
 * Created by admin on 20.11.2014.
 */
public interface ISaver {


    public void save(String path, Collection e);
    public Collection load(String path);

}
