package com.tyss.assignmentsbyprathi.abstractusingbank;

public class BankB extends Bank {
	String depositedAmount="$ 150";

	@Override
	public void getBalance() {
		System.out.println("your current balance is "+depositedAmount);
	}
	
}
