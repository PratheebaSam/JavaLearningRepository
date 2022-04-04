package com.tyss.arraylist.getdatadiff;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	public static <E> void main(String[] args) {
		Employee prathi = new Employee(1,"prathi", "trainee", 30000);
		Employee sam = new Employee(2,"sam", "trainee", 30000);
		Employee parthi = new Employee(3,"parthi", "trainee", 30000);
		
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(prathi);
		arrayList.add(sam);
		arrayList.add(parthi);
		
		
	}
}
