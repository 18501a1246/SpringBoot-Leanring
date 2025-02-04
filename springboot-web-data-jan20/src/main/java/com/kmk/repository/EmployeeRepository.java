package com.kmk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmk.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	/*
	 * List<Employee> findByName(String name); List<Employee>
	 * findByNameAndAddress(String name, String address); List<Employee>
	 * findByNameAndSalaryGreaterThan(String name, Double salary); //Employee
	 * findBySalaryAndSalaryWithin(Double salary, Double value);
	 */}
