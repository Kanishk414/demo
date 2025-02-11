package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.Student;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
public class StudentCRUDController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getString")
    public String getString(){
        return "WELCOME";
    }

//    @GetMapping("/getStudent")
//    public Student getStudent(){
//        Student s = new Student(22,"kanishk");
//        return s;
//    }

    @GetMapping("getEmployee")
    public List<Employee> getEmployee(){
        List<Employee> e = employeeService.getEmployee();
        return e;
    }
}
