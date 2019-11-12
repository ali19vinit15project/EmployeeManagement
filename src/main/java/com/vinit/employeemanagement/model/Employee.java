package com.vinit.employeemanagement.model;

import java.math.BigInteger;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String nameName;
	private String middleName;
	private Date dob;
	private String gender;
	private String martialStatus;
	private String email;
	private BigInteger phoneNum;
	private BigInteger emrgncyPhoneNum;
	private BigInteger aadhar;
	private String pan;
	private String bloodGroup;
	private String qualification;

	@Lob
	private Blob photo;

	@Embedded
	private Address address;

}
