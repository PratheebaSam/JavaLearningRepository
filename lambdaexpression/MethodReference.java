package com.tyss.lambdaexpression;

public class MethodReference {
	public void chat(){
		System.out.println("This is from chat");
	}
	public static void test() {
		System.out.println("This is from test");
	}
	
	public static void main(String[] args) {
		MethodReference reference = new MethodReference();
		Method d= reference::chat;
		d.message();
		Method d1=MethodReference::test;
		d1.message();
	}
}
