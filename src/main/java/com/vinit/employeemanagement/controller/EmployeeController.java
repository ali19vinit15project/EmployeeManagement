package com.vinit.employeemanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinit.employeemanagement.model.Employee;
import com.vinit.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/get", produces = "application/hal+json")
	private Optional<Employee> getEmployeeById() {
		return employeeService.getEmployee(1);
	}
}
