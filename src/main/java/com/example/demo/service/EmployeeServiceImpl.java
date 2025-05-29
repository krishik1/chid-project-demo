//package com.example.demo.service;
//
//import com.example.demo.entity.EmployeeEntity;
//import com.example.demo.model.EmployeeDto;
//import com.example.demo.repo.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public EmployeeEntity saveEmployee(EmployeeDto employee) {
//        EmployeeEntity emp = new EmployeeEntity();
//        emp.setName(employee.getName());
//        emp.setEmail(employee.getEmail());
//        emp.setAge(employee.getAge());
//        return employeeRepository.save(emp);
//    }
//
//    @Override
//    public EmployeeEntity updateEmployee(EmployeeDto employee) {
//        return null;
//    }
//}
