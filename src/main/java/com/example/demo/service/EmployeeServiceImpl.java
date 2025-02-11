package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployee() {
        List<Employee> employeesList = new ArrayList<Employee>();
        Employee employee1 = new Employee("022","kanishk pardikar","Lohegaon pune","8600887906","pardikarkanishk@gmail.com");
        employeesList.add(employee1);
        Employee employee2 = new Employee("033","Satish","pune","7298923489789","pardikarkanishk@gmail.com");
        employeesList.add(employee2);

        return employeesList;
    }
}
