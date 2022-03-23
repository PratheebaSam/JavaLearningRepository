package com.tyss.nextcore;

/* if we extends one class with another class the things present in that class will be accessible by this class
 */

/*Sub class*/

public class SmartPhone extends Phone{
	int camera;
	int cameraCount;
	
	public void play() {
		System.out.println("playing chess");
	}
	public void selfie() {
		System.out.println("taking selfie with my dude");
	}

}
