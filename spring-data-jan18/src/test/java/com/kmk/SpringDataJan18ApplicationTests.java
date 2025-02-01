package com.kmk;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kmk.entity.Employee;
import com.kmk.repository.EmployeeRepository;

@SpringBootTest
class SpringDataJan18ApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	/*
	 * @Test void testSaveEmployee() { Employee emp= new Employee("Bharath",
	 * "Delhi", 7600d); emp= employeeRepository.save(emp); System.out.println(emp);
	 * // Assertions.assertNull(emp.getId()); }
	 */
	/*
	 * @Test void testGetEmployee() { Optional<Employee> emp=
	 * employeeRepository.findById(12L); if(emp.isPresent()) {
	 * System.out.println(emp.get()); }
	 * 
	 * }
	 */

	@Test
	void testDeleteEmployee() {
		employeeRepository.deleteById(9l);
	}

	/*
	 * @Test void testGetAllEmployees() { List<Employee>
	 * emps=employeeRepository.findAll();
	 * 
	 * for(Employee emp:emps) { System.out.println(emp); }
	 * 
	 * emps.forEach(emp -> System.out.println(emp)); }
	 */
	
	@Test
	void testUpdateEmployee() {
		Employee emp=null;
		if(employeeRepository.findById(9l).isPresent()) {
			emp=(employeeRepository.findById(9l)).get();
			emp.setAddress("Hyder");
		}
		employeeRepository.save(emp);
	}
}
