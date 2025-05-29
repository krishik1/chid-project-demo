package com.example.demo.repo;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    EmployeeEntity getEmployeeEntitiesById(Long id);

}
