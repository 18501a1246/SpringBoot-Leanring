package com.flm;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

@SpringBootTest
class TestingSpringJDBC {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	void testSaveEmployee() {
		Employee emp = new Employee("Chitrasri","Hyderabad",60000D);
		employeeDao.saveEmployee(emp);
		System.out.println("Employee is saved.,..");
	}

	
	@Test
	void testGetEmployee() {
		Employee emp = employeeDao.getEmployee(5L);
		System.out.println(emp);
		Assertions.assertNotNull(emp);
		Assertions.assertTrue(emp.getId() > 0);
		Assertions.assertEquals(emp.getId(),5);
	}
	
	//@Test
	void testGetAllEmployee() {
		List<Employee> emps = employeeDao.getAllEmployees();
		Assertions.assertNotNull(emps);
		Assertions.assertEquals(emps.size(),4);
	}
	
	@Test
	void testUpdateEmployee() {
		Employee emp = employeeDao.getEmployee(5L);
		emp.setName("ABCD");
		employeeDao.updateEmployee(emp);
		emp = employeeDao.getEmployee(5L);
		Assertions.assertNotNull(emp);
		Assertions.assertEquals(emp.getName(),"ABCD");
	}
	
	//@Test
	void testDeleteEmployee() {
		employeeDao.deleteEmployee(4L);
	}
}
