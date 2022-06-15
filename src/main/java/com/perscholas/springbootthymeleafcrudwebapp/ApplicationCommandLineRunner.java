package com.perscholas.springbootthymeleafcrudwebapp;

import com.perscholas.springbootthymeleafcrudwebapp.model.Employee;
import com.perscholas.springbootthymeleafcrudwebapp.service.EmployeeService;
import com.perscholas.springbootthymeleafcrudwebapp.service.EmployeeServiceImpl;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ApplicationCommandLineRunner implements CommandLineRunner {

    EmployeeServiceImpl employeeServiceImpl;

    @Autowired
    public ApplicationCommandLineRunner(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeServiceImpl.saveOrUpdate(new Employee(1, "Ramesh", "Fadatare", "ramesh@gmail.com"));
        employeeServiceImpl.saveOrUpdate(new Employee(2, "Cena", "Johncena@gmail.com", "john@gmail.com"));
        employeeServiceImpl.saveOrUpdate(new Employee(3, "Tony", "Stark", "tony@gmail.com"));

    }
}
