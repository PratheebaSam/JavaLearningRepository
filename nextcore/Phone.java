package com.tyss.nextcore;

public class Phone {
	
	/*Super class*/
	
	/*if we doesn't provide constructor the jvm provides the default constructor.
	 * acquiring the properties  and behavior from one class to another class is known as inheritance by using the keyword extends.
	 * why using inheritance because code reusability */
	int price;
	int ram;
	String brand;
	
	public void call(String name) {
		System.out.println(name+"calling");

	}
	
	public void message(String msg) {
		System.out.println(msg);
	}
	
	public void radio() {
		System.out.println("playing pogathae pogathae ........");
	}

}
