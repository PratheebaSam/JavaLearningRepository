package com.tyss.streamcollection.maxsalary;

public class Employee {
	int id;
	String employeeName;
	String designation;
	double salary;
	public Employee(int id, String employeeName, String designation, double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
