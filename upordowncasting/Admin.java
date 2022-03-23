package com.tyss.upordowncasting;

public class Admin extends User{
	public Admin(String name,long number) {
		super(name,number);
		System.out.println("from admin");
	}
	public void add(String user){
		System.out.println(user+"is added");
	}
}
