package com.vinit.employeemanagement.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Embeddable
public class Address {

    @NotBlank
    private String area;

    @NotNull
    private Integer pincode;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

}
