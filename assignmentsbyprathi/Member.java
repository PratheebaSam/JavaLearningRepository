package com.tyss.assignmentsbyprathi;

public class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	long salary;
	
	
	
	public Member(String name, int age, long phoneNumber, String address, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}



	public void printSalary() {
		System.out.println("salary amount:"+salary);
	}
}
