package com.tyss.multithreading.datainconsistency;

public class Atm {
	public static void main(String[] args) {
		try {
			Account account = new Account(100000);
			Husband husband = new Husband(account);
			Wife wife = new Wife(account);
			
			//for getting the name of the thread which is currently executing
			System.out.println(Thread.currentThread().getName());
			//for setting priority
			Thread.currentThread().setPriority(10);
			//for getting the priority of the current thread which is executing.
			System.out.println(Thread.currentThread().getPriority());
			
			husband.start();
			wife.start();
			Thread.sleep(1000);
			account.getBalanace();
		}catch(Exception e) {
			
		}
	}
}
