package com.vinit.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vinit.employeemanagement.model.Employee;

@CrossOrigin("http://localhost:8080")
@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
