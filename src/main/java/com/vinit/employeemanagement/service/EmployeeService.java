package com.vinit.employeemanagement.service;

import java.util.Optional;

import com.vinit.employeemanagement.model.Employee;

public interface EmployeeService {

	Optional<Employee> getEmployee(long id);
}
