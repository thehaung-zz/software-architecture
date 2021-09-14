package com.haung.architecture.repository;

import com.haung.architecture.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
