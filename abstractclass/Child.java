package com.tyss.abstractclass;

public class Child extends TestingAbstract{
	public Child(int x) {
		super(x);		
	}
	
	@Override
	void m1() {
		System.out.println("this is the method from child ");
	}
}
