package com.tyss.accessspecifier.variable;

public class Demo {
	public int x=10;
	protected int y=10;
	int z=20;
	private int a=20;
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);
		
	}
}
