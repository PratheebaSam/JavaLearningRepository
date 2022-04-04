package com.tyss.assignment.arrayprograms;

import java.util.Scanner;

public class Example05 {
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
	
	
	public int[] removeDuplicateElements(int[] arr){    
        int[] temp = new int[arr.length];  
        int j = 0;  
        for (int i=0; i<arr.length-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[arr.length-1];      
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return arr;  
    }  

	public static void main(String[] args) {
		try {
			int array[];			
			Scanner scanner = new Scanner(System.in);
			Example05 ex = new Example05();		
			System.out.println("enter  the size of the array");
			int size = scanner.nextInt();
			array=new int[size];			
			array=ex.getArray(array);
			ex.printArray(array);
			array=ex.removeDuplicateElements(array);
			ex.printArray(array);
		}catch(Exception e ) {
			e.printStackTrace();
		}		
	}
}
