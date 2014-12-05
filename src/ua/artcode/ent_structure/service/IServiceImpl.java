package ua.artcode.ent_structure.service;

import ua.artcode.ent_structure.dao.EmployeeDAO;
import ua.artcode.ent_structure.dao.EmployeeDAOImpl;
import ua.artcode.ent_structure.model.Employee;

import java.util.List;

/**
 * Created by admin on 30.11.2014.
 */
public class IServiceImpl implements IService {

    private EmployeeDAO employeeDAO;

    public IServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
