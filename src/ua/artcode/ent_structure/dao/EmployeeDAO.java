package ua.artcode.ent_structure.dao;

import ua.artcode.ent_structure.model.Employee;

import java.util.List;

//CRUD (CREATE, READ, UPDATE, DELETE)
public interface EmployeeDAO {

    void create(Employee e);
    Employee read(String name);
    List<Employee> all();
    void update(int id, Employee empl);
    void delete(int id);


}
