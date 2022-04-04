package com.tyss.exceptionhandling.licenseapplying;

import java.util.Scanner;

public class Applier {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationForm form = new ApplicationForm();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter you name");
		form.name=scanner.next();
		System.out.println("enter your age");
		form.age=scanner.nextInt();
		form.apply();
	}

}
