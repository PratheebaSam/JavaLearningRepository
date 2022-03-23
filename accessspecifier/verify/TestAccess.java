package com.tyss.accessspecifier.verify;
import com.tyss.accessspecifier.variable.*;

public class TestAccess extends Demo{
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		
		TestAccess testAccess = new TestAccess();
		System.out.println(testAccess.x);
		System.out.println(testAccess.y);
		}
}
