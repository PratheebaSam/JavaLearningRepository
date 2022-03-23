package com.tyss.superthis;

public class Class extends Parent{
	int a;
	int b;
	int c;
	int d;
	int e;
	public Class(int x,int y,int a) {
		super(x,y);
		this.a=a;	
		
	}
	public Class(int x,int y,int a,int b,int c) {
		this(x,y,a);
		this.b=b;
		this.c=c;
		
	}
	public Class(int x,int y,int a,int b,int c,int d,int e) {
		this(x,y,a,b,c);
		this.d=d;
		this.e=e;
		
	}
	
}
