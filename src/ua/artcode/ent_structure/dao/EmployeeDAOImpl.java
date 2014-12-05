package ua.artcode.ent_structure.dao;

import ua.artcode.ent_structure.db.DataHolder;
import ua.artcode.ent_structure.model.Employee;

import java.util.List;

/**
 * Created by admin on 30.11.2014.
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(Employee e) {
        DataHolder.employee.add(e);
    }

    @Override
    public Employee read(String name) {
        return null;
    }

    @Override
    public List<Employee> all() {
        return DataHolder.employee;
    }

    @Override
    public void update(int id, Employee empl) {

    }

    @Override
    public void delete(int id) {

    }
}
