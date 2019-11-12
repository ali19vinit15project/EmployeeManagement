package com.vinit.employeemanagement.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

	private String area;
	private Integer pincode;
	private String city;
	private String state;

}
