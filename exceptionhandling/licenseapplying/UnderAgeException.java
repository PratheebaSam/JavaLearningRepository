package com.tyss.exceptionhandling.licenseapplying;

public class UnderAgeException extends RuntimeException {
	public UnderAgeException(String msg) {
		super(msg);
	}
}
