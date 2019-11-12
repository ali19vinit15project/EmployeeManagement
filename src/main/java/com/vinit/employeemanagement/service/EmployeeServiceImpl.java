package com.vinit.employeemanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinit.employeemanagement.dao.EmployeeDao;
import com.vinit.employeemanagement.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Optional<Employee> getEmployee(long id) {
		return employeeDao.findById(id);
	}
}
