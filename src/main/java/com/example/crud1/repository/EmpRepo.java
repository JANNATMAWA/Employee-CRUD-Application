package com.example.crud1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud1.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}