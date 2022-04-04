package com.tyss.collection.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Company {
	public static void main(String[] args) {
		Employee prathi = new Employee(1,"prathi", "trainee", 30000);
		Employee sam = new Employee(2,"sam", "trainee", 30000);
		Employee parthi = new Employee(3,"parthi", "trainee", 30000);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(parthi);
		list.add(sam);
		list.add(prathi);

		Collections.sort(list);
		Iterator<Employee> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
