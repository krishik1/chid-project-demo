package com.example.demo.service;

import com.example.demo.entity.Employees;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employees saveEmployee(Employee employee) {
        Employees emp = new Employees();
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setAge(employee.getAge());
        return employeeRepository.save(emp);
    }

    @Override
    public Employees updateEmployee(Employee employee) {
        return null;
    }
}
