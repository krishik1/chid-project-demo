package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;
import com.example.demo.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NewEmployeeService implements NewEmployeeServiceI {

    //Constructor Injection
    private final EmployeeRepository employeeRepository;

    public NewEmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<EmployeeEntity> addEmployees(List<EmployeeDto> employeeList) {
        List<EmployeeEntity> employeeEntities = new ArrayList<>();
        for(EmployeeDto emp:employeeList) {
            EmployeeEntity employees = EmployeeEntity.builder().name(emp.getName())
                    .age(emp.getAge()).email(emp.getEmail()).build();
            employeeEntities.add(employees);
        }
        return employeeRepository.saveAll(employeeEntities);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeDto employeeDto) {
        EmployeeEntity empEntity = employeeRepository.getEmployeeEntitiesById(employeeDto.getId());
        empEntity.setName(employeeDto.getName());
        empEntity.setAge(employeeDto.getAge());
        empEntity.setEmail(employeeDto.getEmail());
        return employeeRepository.save(empEntity);
    }
}
