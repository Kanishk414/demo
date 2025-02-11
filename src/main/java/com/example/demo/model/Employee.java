package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String EmployeeId;
    private String EmployeeName;
    private String EmployeeAddress;
    private String EmployeePhone;
    private String EmployeeEmail;

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        EmployeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        EmployeeEmail = employeeEmail;
    }

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String employeeAddress, String employeePhone, String employeeEmail) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EmployeeAddress = employeeAddress;
        EmployeePhone = employeePhone;
        EmployeeEmail = employeeEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeAddress='" + EmployeeAddress + '\'' +
                ", EmployeePhone='" + EmployeePhone + '\'' +
                ", EmployeeEmail='" + EmployeeEmail + '\'' +
                '}';
    }
}
