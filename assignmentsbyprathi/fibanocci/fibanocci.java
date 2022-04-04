package com.tyss.assignmentsbyprathi.fibanocci;

import java.util.Scanner;

public class fibanocci {
	public void fibanocciNumber(int n) {
		try {
			int n1=0;
			int n2=1,n3;
			System.out.println(n1+ " \n"+n2);
			for(int i=2;i<n;i++) {
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			fibanocci fibanocci = new fibanocci();
			Scanner scanner = new Scanner(System.in);
			int x;
			System.out.println("enter the limit");
			x=scanner.nextInt();
			fibanocci.fibanocciNumber(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
