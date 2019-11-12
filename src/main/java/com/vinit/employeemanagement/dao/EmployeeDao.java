package com.vinit.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vinit.employeemanagement.model.Employee;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeDao extends JpaRepository<Employee, Long> {
	

}
