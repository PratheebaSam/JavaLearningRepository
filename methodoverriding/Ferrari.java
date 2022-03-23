package com.tyss.methodoverriding;

public class Ferrari extends Car {
	@Override
	public void drive() {
		System.out.println("driving in fast mode");
	}
}
