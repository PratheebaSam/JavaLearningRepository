package com.tyss.runnable.implementation;

public class RunnableImplementation {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread thread2 = new Thread(thread);
		thread2.start();
	}
}
