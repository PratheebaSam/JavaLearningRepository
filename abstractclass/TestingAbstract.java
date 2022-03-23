package com.tyss.abstractclass;

public abstract class TestingAbstract {
	int x;
	static int y;
	 
	 public TestingAbstract(int x) {
		super();
		this.x = x;
	}
	abstract void m1();
	 void m2() {
		 System.out.println("this is method from testing Abstract"+ x);
	 }
}
