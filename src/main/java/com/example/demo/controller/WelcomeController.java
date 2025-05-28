package com.example.demo.controller;

import com.example.demo.entity.Employees;
import com.example.demo.model.Employee;
import com.example.demo.model.StudentDto;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("welcome/")
public class WelcomeController {

    /*
    ->UserRepo,ProductRepo,OrderRepo->ProductService<-OrderService,UserService
    OrderRepo->OrderService
    UserRepo->UserService
    * Controller ->Service->Repository
    * Service->
    * */
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private StudentService studentService;

    private List<Employees> employees=new ArrayList<>();
    @GetMapping("greet/{in}")
    public String print(@PathVariable String in) {
        return "Welcome to learn "+in;
    }

    @GetMapping("/students")
    private List<StudentDto> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("employee")
    public List<Employees> addEmployee(@RequestBody Employee employee) {
        Employees emp = employeeService.saveEmployee(employee);
        employees.add(emp);
        return employees;
    }
    @PutMapping("update-employee")
    public List<Employees> updateEmployee(@RequestBody Employee employee) {
        //employees.add(n);
        return employees;
    }


}
