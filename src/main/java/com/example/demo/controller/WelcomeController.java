//package com.example.demo.controller;
//
//import com.example.demo.entity.EmployeeEntity;
//import com.example.demo.model.EmployeeDto;
//import com.example.demo.model.StudentDto;
//import com.example.demo.service.EmployeeService;
//import com.example.demo.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("welcome/")
//public class WelcomeController {
//
//    /*
//    ->UserRepo,ProductRepo,OrderRepo->ProductService<-OrderService,UserService
//    OrderRepo->OrderService
//    UserRepo->UserService
//    * Controller ->Service->Repository
//    * Service->
//    * */
//    @Autowired
//    private EmployeeService employeeService;
//
//    @Autowired
//    private StudentService studentService;
//
//    private List<EmployeeEntity> employees=new ArrayList<>();
//    @GetMapping("greet/{in}")
//    public String print(@PathVariable String in) {
//        return "Welcome to learn "+in;
//    }
//
//    @GetMapping("/students")
//    private List<StudentDto> getStudents() {
//        return studentService.getStudents();
//    }
//
//    @PostMapping("employee")
//    public List<EmployeeEntity> addEmployee(@RequestBody EmployeeDto employee) {
//        EmployeeEntity emp = employeeService.saveEmployee(employee);
//        employees.add(emp);
//        return employees;
//    }
//    @PutMapping("update-employee")
//    public List<EmployeeEntity> updateEmployee(@RequestBody EmployeeDto employee) {
//        //employees.add(n);
//        return employees;
//    }
//
//
//}
