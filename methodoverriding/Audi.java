package com.tyss.methodoverriding;

public class Audi extends Car{
	@Override
	public void brake() {
		System.out.println("break have both front and back");
	}
}
