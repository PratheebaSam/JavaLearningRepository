package com.tyss.accessspecifier.encapsulation;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private String designation="trainee";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Employee(String name, int age, double salary, String designation) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//		this.designation = designation;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
