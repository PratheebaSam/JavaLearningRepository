package com.tyss.exceptionhandling.banking;

@SuppressWarnings("serial")
public class InSuffiecientBalanceException extends RuntimeException{
	

	public InSuffiecientBalanceException(String msg) {
		super(msg);
	}
	
}
