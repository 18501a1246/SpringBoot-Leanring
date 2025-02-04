package com.kmk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kmk.entity.Employee;
import com.kmk.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmployeeController {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/showAll")
	public String showAllEmployees(Model m) {
		log.error("Enter into controller method showAllEmployees()...");
		log.debug("Enter into controller method showAllEmployees()...");
		log.info("Enter into controller method showAllEmployees()...");
		log.warn("Enter into controller method showAllEmployees()...");
		log.debug("Enter into controller method showAllEmployees()...");
	List<Employee> emps=employeeRepository.findAll();
	m.addAttribute("emps", emps);
		return "show_employee";
	}
	
}
