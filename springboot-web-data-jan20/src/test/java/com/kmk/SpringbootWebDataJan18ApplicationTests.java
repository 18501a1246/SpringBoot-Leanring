package com.kmk;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kmk.entity.Employee;
import com.kmk.repository.EmployeeRepository;

@SpringBootTest
class SpringbootWebDataJan18ApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	/*
	 * // @Test void testSaveEmployee() { Employee emp= new
	 * Employee("Mahesh","Hyderabad", 13000D);
	 * System.out.println(employeeRepository.save(emp)); } //@Test void
	 * testfindByName() { List<Employee>
	 * emps=employeeRepository.findByName("mohan"); emps.forEach(emp ->
	 * System.out.println(emp)); } //@Test void testfindByNameAndAddress() {
	 * List<Employee> emps=employeeRepository.findByNameAndAddress("mohan","vij");
	 * emps.forEach(emp -> System.out.println(emp)); } //@Test void
	 * testfindByNameAndSalaryGreatethan() { List<Employee>
	 * emps=employeeRepository.findByNameAndSalaryGreaterThan("mohan",11000D);
	 * //System.out.println(employeeRepository.findBySalaryAndSalaryWithin(12000D,
	 * 11000D)); //emps.forEach(emp -> System.out.println(emp)); }
	 */
}
