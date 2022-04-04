package com.tyss.assignmentsbyprathi.array;

import java.util.Scanner;

public class ArrayExample1 {
	int limit;
	static int a[];
	public void printArray(String msg) {
		System.out.println(msg);
		if(limit>2) {
			for(int i=0;i<2;i++) {
				System.out.print(a[i]);
			}			
		}else {
			for(int j=0;j<limit;j++) {
				System.out.print(a[j]);
			}
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			ArrayExample1 ar = new ArrayExample1();
			System.out.println("enter the limit");
			ar.limit=scanner.nextInt();
			if(ar.limit<=0) {
				
			}else {
				a=new int[ar.limit];
				for(int i=0;i<ar.limit;i++) {
					System.out.println("enter the "+(i+1)+" value");
					a[i]=scanner.nextInt();
				}
				ar.printArray("The elements present in array");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
