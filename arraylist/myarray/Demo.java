package com.tyss.arraylist.myarray;

public class Demo {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add(199);
		list.add(200);
		list.add(201);
		System.out.println(list.get(2));
	}
}
