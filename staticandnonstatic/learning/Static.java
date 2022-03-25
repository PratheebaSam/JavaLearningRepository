package com.tyss.staticandnonstatic.learning;

public class Static {
	static int x=10;
	int y=20;
	static {
		System.out.println("This is the static block");
		System.out.println(x);
	}
	{
		System.out.println("this is the non static block");
		System.out.println(y);
	}
	public static void main(String[] args) {
		Static static1 = new Static();
		System.out.println(static1.y);
		Static static2 = new Static();
		System.out.println(static2.y);
		
	}
}
