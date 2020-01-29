package com.vinit.employeemanagement.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vinit.employeemanagement.model.Employee;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeDao extends JpaRepository<Employee, Long> {

    public static final String SEARCH_QUERY = "SELECT e FROM Employee e "//
	    + "WHERE "//
	    + "lower(e.firstName) LIKE lower(concat('%', :q,'%')) OR "
	    + "lower(e.lastName) LIKE lower(concat('%', :q,'%')) OR "
	    + "lower(e.address.city) LIKE lower(concat('%', :q,'%'))";

    @Query(SEARCH_QUERY)
    Page<Employee> searchBy(@Param("q") String q,Pageable pageable);

}
