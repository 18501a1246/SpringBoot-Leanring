package com.kmk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmk.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
