package com.tyss.exceptionhandling.handling1;

import java.util.Scanner;

public class Excersice1 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the first num");
			int x=scanner.nextInt();
			System.out.println("enter the second number");
			int y=scanner.nextInt();
			int res=x/y;
			int []a;
			a=new int[res];
			System.out.println(a[4]);
		//}catch(ArrayIndexOutOfBoundsException e){
			//System.out.println("array size is less te what you give");
		//}catch(ArithmeticException r) {
			//System.out.println("your denomitor must be more than 0");
		//}
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("your denomitor must be more than 0");
			}if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("array size less then what you give");
			}
		}
		
	}
}
