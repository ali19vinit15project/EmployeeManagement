package com.vinit.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinit.employeemanagement.dao.EmployeeDao;
import com.vinit.employeemanagement.model.Employee;

@RepositoryRestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<PersistentEntityResource> saveEmployee(@RequestBody Employee employee, PersistentEntityResourceAssembler persistentEntityResourceAssembler) {

        System.out.println("EmployeeController:saveEmployee before save");
        employee = employeeDao.save(employee);
        System.out.println("EmployeeController:saveEmployee after save");
        return ResponseEntity.ok(persistentEntityResourceAssembler.toResource(employee));
    }
}
// Here the Listener wont work. As control never goes to Spring data rest and the events are never called.
