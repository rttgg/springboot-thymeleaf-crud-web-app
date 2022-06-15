package com.perscholas.springbootthymeleafcrudwebapp.service;

import com.perscholas.springbootthymeleafcrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeById(long id);
}
