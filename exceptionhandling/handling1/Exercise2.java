package com.tyss.exceptionhandling.handling1;

public class Exercise2 {
		public static void main(String[] args) {
			System.out.println("program started");
			try {
				throw new ArithmeticException();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("program end");
		}
}
