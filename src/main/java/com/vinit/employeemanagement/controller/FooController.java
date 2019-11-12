package com.vinit.employeemanagement.controller;

import javax.annotation.Resources;

import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinit.employeemanagement.dao.EmployeeDao;

@BasePathAwareController
public class FooController {

    private final EmployeeDao employeeDao;

    public FooController(final EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @RequestMapping(path="foos", method=RequestMethod.GET, produces="application/hal+json")
    public Resources getAllFooFiltered() {
        
    }

}