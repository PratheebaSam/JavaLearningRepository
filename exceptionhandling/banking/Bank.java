package com.tyss.exceptionhandling.banking;

public class Bank {
		private int balance;
		public int getBalance() {
			return balance;
		}
		public void deposit(int amount) {
			balance+=amount;
			System.out.println("the balance after the deposit is "+balance);
		}
		public void withdraw(int amount) {
			if(amount<=balance && amount>0) {
				balance-=amount;
				System.out.println("the balance left "+balance);
			}else {
				try {
					throw new InSuffiecientBalanceException("sjkadhdfkjashdkjfh");
				}catch(InSuffiecientBalanceException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}

}
