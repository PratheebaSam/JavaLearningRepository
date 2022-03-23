package com.tyss.accessspecifier.variable;

public class Test {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		//System.out.println(demo.a);=>private is accessible only within the class.
	}

}
