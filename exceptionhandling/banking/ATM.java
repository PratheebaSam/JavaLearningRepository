package com.tyss.exceptionhandling.banking;

public class ATM {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getBalance());
		bank.deposit(1000);
		bank.getBalance();
		bank.withdraw(500);
	}
}
