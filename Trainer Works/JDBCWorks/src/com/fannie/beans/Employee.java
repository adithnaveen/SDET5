package com.fannie.beans;

// a bean is one who has private variables 
// public getters and setters 
public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	private String email;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", email=" + email + "]";
	}
	
	public Employee(){}
	
	public Employee(int empId, String empName, double empSal, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.email = email;
	}
	
	
}
