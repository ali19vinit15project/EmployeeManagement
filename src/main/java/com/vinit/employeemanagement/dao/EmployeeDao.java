package com.vinit.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.querydsl.core.types.dsl.StringPath;
import com.vinit.employeemanagement.model.Employee;
import com.vinit.employeemanagement.model.QEmployee;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeDao extends JpaRepository<Employee, Long>, QuerydslPredicateExecutor<Employee>,
	QuerydslBinderCustomizer<QEmployee> {

    @Override
    default public void customize(QuerydslBindings bindings, QEmployee emp) {

	// specific properties
	// bindings.bind(emp.firstName).first((path, value) ->
	// path.equalsIgnoreCase(value));
	// bindings.bind(emp.lastName).first((path, value) ->
	// path.equalsIgnoreCase(value));

	// OR
	// All properties
	bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));

	// excluding
	// bindings.excluding(emp.aadhar);

    }
}
