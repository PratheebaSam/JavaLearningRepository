package com.tyss.assignment.arrayprograms;

import java.util.Scanner;

public class Example03 {
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
	public int[] rightRotate(int[] array,int n) {
		try {
			for(int i = 0;i < n; i++){  
	            int j, last;             
	            last = array[array.length-1]; 	            
	            for(j = array.length-1; j > 0; j--){  	                  
	                array[j] = array[j-1];    
	            }    	               
	            array[0] = last;    
	        } 			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return array;
	}
	
	public static void main(String[] args) {
		try {
			int array[];			
			Scanner scanner = new Scanner(System.in);
			Example03 ex = new Example03();		
			System.out.println("enter  the size of the array");
			int size = scanner.nextInt();
			array=new int[size];			
			array=ex.getArray(array);
			ex.printArray(array);
			System.out.println("enter the number of left shift");
			int n=scanner.nextInt();
			array=ex.rightRotate(array,n);
			ex.printArray(array);
		}catch(Exception e ) {
			e.printStackTrace();
		}		
	}
}
