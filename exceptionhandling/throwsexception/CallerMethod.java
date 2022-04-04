package com.tyss.exceptionhandling.throwsexception;

import java.io.File;

public class CallerMethod {
	public static void main(String[] args) {
		CalledMethod method = new CalledMethod();
		File file = new File("file");
		String task;
		try {
			task=method.task(file);
			System.out.println(task);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program");
	}
}
