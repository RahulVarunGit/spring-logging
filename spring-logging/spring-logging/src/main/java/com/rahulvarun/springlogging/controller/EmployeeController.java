package com.rahulvarun.springlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahulvarun.springlogging.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger logInfo = LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/{id}")
	public Employee getEmployee(String id) {
		logInfo.info("Info Logger in getEmployee");
		logInfo.debug("Debug Logger in getEmpolyee");
		return (new Employee("1","aaa","bbb","1231231234"));
	}
}
