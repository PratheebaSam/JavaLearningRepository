package com.tyss.assignment.arrayprograms;

import java.util.Scanner;

public class Example01 {
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
	public void frequency(int[] array) {
		try {
			int visited[]=new int[array.length];
			for (int i = 0; i < visited.length; i++) {
				visited[i]=0;
			}
			for (int i = 0; i < array.length; i++) {
				if(visited[i]==0) {
					int count=1;
					for(int j=i+1;j<array.length;j++) {
						if(array[i]==array[j]) {
							count++;
							visited[j]=1;
						}
					}
					System.out.println("the count of "+array[i]+" = "+count);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		try {
			int array[];
			
			Scanner scanner = new Scanner(System.in);
			Example01 ex = new Example01();		
			System.out.println("enter  the size of the array");
			int size = scanner.nextInt();
			array=new int[size];
			//int array1[]=new int[size];
			array=ex.getArray(array);
			ex.printArray(array);
			//array1=array;
			//ex.printArray(array1);
			ex.frequency(array);
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		
	}
}
