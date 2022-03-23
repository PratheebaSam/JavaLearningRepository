package com.tyss.methodoverriding;

public class MethodOverridingWithCar {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		ferrari.brake();
		ferrari.drive();
		Audi audi = new Audi();
		audi.brake();
		audi.drive();
	}
	
}
