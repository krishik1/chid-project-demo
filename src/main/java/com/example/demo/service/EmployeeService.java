package com.example.demo.service;

import com.example.demo.entity.Employees;
import com.example.demo.model.Employee;

public interface EmployeeService {
    Employees saveEmployee(Employee employee);
    Employees updateEmployee(Employee employee);
}
