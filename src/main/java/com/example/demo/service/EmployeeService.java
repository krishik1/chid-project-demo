package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeDto employee);
    EmployeeEntity updateEmployee(EmployeeDto employee);
}
