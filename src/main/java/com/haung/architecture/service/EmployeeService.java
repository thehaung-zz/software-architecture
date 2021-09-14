package com.haung.architecture.service;

import com.haung.architecture.entity.Employee;

import java.util.List;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

public interface EmployeeService {

    Employee getEmployeeById(Long id);

    List<Employee> getAllEmployee();

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
