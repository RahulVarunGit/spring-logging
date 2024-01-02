package com.rahulvarun.springlogging.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rahulvarun.springlogging.controller.EmployeeController;

public class Employee {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private static final Logger logInfo = LoggerFactory.getLogger(EmployeeController.class);
	
	public Employee() {
		super();
	}

	public Employee(String id, String firstName, String lastName, String phoneNo) {
		
		super();
		logInfo.info("Info log from Employee constructor");
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
