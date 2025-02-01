package com.kmk.dao;

import java.util.List;

import com.kmk.model.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Long id);
	Employee getEmployee(Long id);
	List<Employee> getAllEmployees();
}
