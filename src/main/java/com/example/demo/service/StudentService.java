package com.example.demo.service;

import com.example.demo.model.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private RestClient restClient;

    public List<StudentDto> getStudents() {
        StudentDto[] studs = restClient.get().uri("").retrieve().body(StudentDto[].class);
        return Arrays.asList(studs);
    }
}
