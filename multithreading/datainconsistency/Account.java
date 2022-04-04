package com.tyss.multithreading.datainconsistency;

public class Account {
	double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	public synchronized void withdraw(int amount) {
		if(amount<balance) {
			balance=balance-amount;
		}
	}
	public synchronized void deposit(int amount) {
		balance=balance+amount;
	}
	public void getBalanace() {
		System.out.println("The balance left is : "+balance);
	}
}
