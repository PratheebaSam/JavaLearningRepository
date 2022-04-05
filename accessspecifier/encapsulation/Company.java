package com.tyss.accessspecifier.encapsulation;

public class Company {
	public static void main(String[] args) {
//		we can also set values by using parameterized constructor. 
//		Employee employee = new Employee("prathi",20,200000,"employee");
		Employee employee = new Employee();
		employee.setAge(20);
		employee.setDesignation("employee");
		employee.setName("prathi");
		employee.setSalary(2000000);
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
	}
}
