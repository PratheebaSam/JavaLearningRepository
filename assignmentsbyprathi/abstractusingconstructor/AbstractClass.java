package com.tyss.assignmentsbyprathi.abstractusingconstructor;

public abstract class AbstractClass {
	AbstractClass(){
		System.out.println("THis is a constructor from abstract class");
	}
	public abstract void Amethod();
	public void normalMethod() {
		System.out.println("THis is a normal class from the abstract method");
	}
}
