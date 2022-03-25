package com.tyss.exceptionhandling.handling1;

public class Exercise {
	public static void main(String[] args) {
		int a[];
		a=new int[4];
		try {
			System.out.println(a[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program ends");
	}
}
