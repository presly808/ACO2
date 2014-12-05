package ua.artcode.ent_structure.service;

import ua.artcode.ent_structure.model.Employee;

import java.util.List;

// Business logic
public interface IService {

    void addEmployee(Employee employee);
    List<Employee> getAll();


}
