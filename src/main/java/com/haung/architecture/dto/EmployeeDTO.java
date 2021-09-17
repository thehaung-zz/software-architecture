package com.haung.architecture.dto;

import com.haung.architecture.entity.Employee;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

@Data
@Slf4j
public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String emailAddress;


    public EmployeeDTO(Employee employee) {
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.emailAddress = employee.getEmailAddress();
    }

}
