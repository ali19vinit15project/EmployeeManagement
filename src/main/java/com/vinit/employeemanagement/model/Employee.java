package com.vinit.employeemanagement.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Employee extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String middleName;

    @Past
    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dob;

    @NotBlank
    private String gender;

    @NotBlank
    private String martialStatus;

    @NotNull
    @Column(unique = true)
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phoneNum;

    @NotNull
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String emrgncyPhoneNum;

    @NotNull
    @Column(unique = true)
    @Pattern(regexp = "(^$|[0-9]{12})")
    private String aadhar;

    @NotBlank
    private String qualification;

    @Lob
    @Type(type = "text")
    @NotNull
    private String photo;

    @Valid
    @Embedded
    private Address address;

    @Email
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    @Pattern(regexp = "^$|^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$")
    private String pan;

    private String bloodGroup;
}
