package ua.artcode.ent_structure.view;

import ua.artcode.ent_structure.model.Employee;
import ua.artcode.ent_structure.service.IService;

import java.util.Collections;

/**
 * Created by admin on 30.11.2014.
 */
public class FormatDataView {

    private IService service;

    public FormatDataView(IService service) {
        this.service = service;
    }

    public void menu(){
        System.out.println("1.Show" +
                "\n2.Get employee by id"+"" +
                "\n3.exit");
    }

    public void buttonShow(){
        for(Employee e : service.getAll()){
            System.out.println(e);
        }
    }


}
