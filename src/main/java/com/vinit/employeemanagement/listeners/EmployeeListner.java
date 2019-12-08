package com.vinit.employeemanagement.listeners;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import com.vinit.employeemanagement.model.Employee;

@Component
public class EmployeeListner extends AbstractRepositoryEventListener<Employee> {

    @Override
    protected void onBeforeCreate(Employee entity) {
        entity.setPhoto("Hello");
        System.out.println("in on before");
    }
}
