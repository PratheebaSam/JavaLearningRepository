package com.tyss.methodoverriding;

public class Test1 extends Test{
	//public void message() {
	//	System.out.println("message received");
	//}
	@Override
	public void add() {
		System.out.println("adding two num and increased by 10");
	}
}
