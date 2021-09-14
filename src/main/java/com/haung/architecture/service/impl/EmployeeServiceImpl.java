package com.haung.architecture.service.impl;

import com.haung.architecture.entity.Employee;
import com.haung.architecture.exception.EmployeeNotFoundException;
import com.haung.architecture.repository.EmployeeRepository;
import com.haung.architecture.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updateEmployee) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setFirstName(updateEmployee.getFirstName());
                    employee.setLastName(updateEmployee.getLastName());
                    employee.setEmailAddress(updateEmployee.getEmailAddress());
                    return employeeRepository.save(employee);
                }).orElseGet(() -> {
                    updateEmployee.setId(id);
                    return employeeRepository.save(updateEmployee);
                });
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
