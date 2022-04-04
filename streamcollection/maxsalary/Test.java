package com.tyss.streamcollection.maxsalary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Employee> asList=Arrays.asList(new Employee(1,"prathi","backend developer",200000),
				new Employee(2,"sam","backend developer",20000),
				new Employee(3,"prathisam","backend developer",205000));		
		Optional<Employee> max = asList.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(max);
		boolean match = asList.stream().anyMatch(emp->emp.getEmployeeName()=="prathi");
		System.out.println(match);
		List<Employee> collect = asList.stream().filter(emp->emp.getSalary()>30000).collect(Collectors.toList());
		
		//collect.forEach(c);
		
	}
}
