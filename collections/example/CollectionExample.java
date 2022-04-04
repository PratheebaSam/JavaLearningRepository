package com.tyss.collections.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(300);
		
		List list2 = new ArrayList();
		list2.add(20);
		list2.add(50);
		
		ArrayList list3 = new ArrayList();
		list3.add(10);
		list3.add(100);
		list3.add(50);
		
		list.addAll(list2);
		System.out.println(list);
		list.removeAll(list3);
		System.out.println(list);
		
	}
}
