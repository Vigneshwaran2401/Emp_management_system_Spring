package com.java.ems.dto;

// This is use for data transfer form server to client

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private  Long id;
    private String firstName;
    private String lastName;
    private String email;
}
