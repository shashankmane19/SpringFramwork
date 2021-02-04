package com.csi.hoop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	 @Id
	 @GeneratedValue
	 private int empId;
	 
	 private String empName;
	 
	 private double empSalary;
	 
	 @OneToOne
	 private Address address;

	public Employee(String empName, double empSalary, Address address) {
	
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}
	 
	 
     
}
