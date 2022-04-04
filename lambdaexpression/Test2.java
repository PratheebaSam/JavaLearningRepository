package com.tyss.lambdaexpression;

public class Test2 {
	public static void main(String[] args) {
		MyThread obj=(x,y)->{
			return x+y;		
		};
		int add=obj.add(20, 40);
		System.out.println(add);
	}
}
