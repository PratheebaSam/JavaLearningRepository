package com.tyss.assignmentsbyprathi.abstractusingbank;

public class BankA extends Bank{
	String depositedAmount="$ 100";
	@Override
	public void getBalance() {
		System.out.println("your current balance is "+depositedAmount);
	}
	
}
