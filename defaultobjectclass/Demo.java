package com.tyss.defaultobjectclass;
import java.util.LinkedList;

public class Demo {
	@Override
	public String toString() {
		return "Object is from demo";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkedList<?>) {
			return true;
		}else {
			return false;
		}		
	}
	//@Override
	//public int hashCode{
	//	return 1;
	//}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("this is from finalize");
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.toString();
		System.out.println(demo);
		
		Demo demo1=new Demo();
		System.out.println("this is the object of second ref\n"+demo1);
		boolean equals=demo1.equals(demo1);
		System.out.println(equals);
		
		demo=null;
		
		Demo demo2=new Demo();
		int hashCode=demo2.hashCode();
		System.out.println(hashCode);
		demo1=null;
		demo2=null;
		System.gc();
		
	}
}
