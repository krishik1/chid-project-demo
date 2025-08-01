package com.example.demo.model;

import lombok.*;

@Data
@Builder
public class EmployeeDto {
    private Long id;
    private String name;

    private String email;

    private int age;
}
