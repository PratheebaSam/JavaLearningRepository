package com.tyss.upordowncasting;

public class User {
	String name;
	long number;
	
	public User(String name,long number) {
		this.name=name;
		System.out.println("from user");
		this.number=number;
	}
	public User() {
		System.out.println("from user");
	}
	public void chat() {
		System.out.println(name+"is chatting"+number);
	}

}
