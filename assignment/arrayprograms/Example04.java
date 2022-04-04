package com.tyss.assignment.arrayprograms;

import java.util.Scanner;

public class Example04 {
	public int[] getArray(int[] array) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the elements in the array");
			for(int i=0;i<array.length;i++) {
				array[i]=scanner.nextInt();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return array;
	}
	public void printArray(int[] array) {
		try {
			System.out.println("the elements present in the array");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}				
	}
	public void duplicate(int[] array) {
		try {
			System.out.println("Duplicate elements in given array: ");  
			for (int i=0;i<array.length;i++) {  
			    for (int j=i+1;j<array.length;j++) { 
			        if(array[i] == array[j]) {
			            System.out.println(array[j]); 
			        }
			    }
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
