package com.tyss.assignmentsbyprathi.arraySorting;

import java.util.Scanner;

public class SortingArray {
	static int a[];
	public void printArray(String msg) {
		System.out.println(msg);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
	public void sorting() {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		printArray("\narray elements after sorting");
	}
	public static void main(String[] args) {
		SortingArray array = new SortingArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scanner.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the "+(i+1)+" value");
			a[i]=scanner.nextInt();
		}
		array.printArray("array elements before sorting");
		array.sorting();		
	}
}
