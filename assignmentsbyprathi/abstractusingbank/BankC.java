package com.tyss.assignmentsbyprathi.abstractusingbank;

public class BankC extends Bank{
	String depositedAmount="$ 200";

	@Override
	public void getBalance() {
		System.out.println("your current balance is "+depositedAmount);
		
	}
}
