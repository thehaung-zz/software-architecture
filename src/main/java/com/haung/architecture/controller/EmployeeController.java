package com.haung.architecture.controller;

import com.haung.architecture.entity.Employee;
import com.haung.architecture.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    private List<Employee> findAll() {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    private Employee findById(@PathVariable(value = "id") Long id) {
        return this.employeeService.getEmployeeById(id);
    }

    @PostMapping("/employees")
    private Employee create(@Valid @RequestBody Employee employee) {
        return this.employeeService.createEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    private Employee update(@PathVariable(value = "id") Long id, @RequestBody Employee employee) {
        return this.employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
