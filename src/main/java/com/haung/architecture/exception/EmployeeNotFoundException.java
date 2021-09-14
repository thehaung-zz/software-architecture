package com.haung.architecture.exception;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee with id: " + id);
    }
}
