package com.tyss.exceptionhandling.licenseapplying;

public class ApplicationForm {
	String name;
	int age;
	public void apply() {
		if(age>18) {
			System.out.println("Elilgible to apply");
		}else {
			try {
				throw new UnderAgeException("Under Age");
			}catch(UnderAgeException u) {
				System.out.println(u.getMessage());			
			}
		}
	}
	
}
