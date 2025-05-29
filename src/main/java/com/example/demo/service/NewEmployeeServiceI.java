package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;

import java.util.List;

public interface NewEmployeeServiceI {
    List<EmployeeEntity> addEmployees(List<EmployeeDto> employeeList);

    EmployeeEntity updateEmployee(EmployeeDto employeeDto);
}
