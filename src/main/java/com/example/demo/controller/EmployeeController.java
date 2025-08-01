package com.example.demo.controller;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;
import com.example.demo.service.NewEmployeeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
    //Field Injection
    // testbfrduhkhgf
    @Autowired
    private NewEmployeeServiceI newEmployeeServiceI;
    //Adding Employee to db
    @PostMapping("/add")
    public List<EmployeeEntity> addEmplyees(@RequestBody List<EmployeeDto> employees) {
        return newEmployeeServiceI.addEmployees(employees);
    }

    @PutMapping("/update")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return newEmployeeServiceI.updateEmployee(employeeDto);
    }
}
