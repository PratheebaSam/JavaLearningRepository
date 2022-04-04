package com.tyss.assignmentsbyprathi.methodrefusingarguements;


public class Test {
	public void chat(String msg) {
		System.out.println(msg);
	}
	public static void test(String msg1) {
		System.out.println(msg1);
	}
	
	public static void main(String[] args) {
		Test reference = new Test();
		Method d= reference::chat;
		d.message("This is from chat");
		Method d1=Test::test;
		d1.message("This is from test");
}
}
