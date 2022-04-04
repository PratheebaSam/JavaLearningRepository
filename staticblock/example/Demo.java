package com.tyss.staticblock.example;

public class Demo implements Test,Test2{

	@Override
	public void message() {
		System.out.println("vanakkam");
		
		//we can use test interface message by using the following method
		//test.super.message();
	}
	
}
