package com.tyss.interfacejava;

public class InterfaceExecution {
	public static void main(String[] args) {
		Calculator cal=new Casio();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(40, 50));
		System.out.println(cal.multiply(4, 7));
		System.out.println(cal.division(10, 5));
	}
}
