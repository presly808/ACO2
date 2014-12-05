package ua.artcode.ent_structure.db;

import ua.artcode.ent_structure.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 30.11.2014.
 */
public class DataHolder {

    public static final List<Employee> employee = init();

    public static List<Employee> init(){
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Andriy", 2000));
        employee.add(new Employee(2, "Serhii", 2000));
        employee.add(new Employee(3, "Valeriy", 1400));
        employee.add(new Employee(4, "Olexiy", 1800));
        return employee;
    }





}
