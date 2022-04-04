package com.tyss.multithreading;

public class Exercise extends Thread{
	int max;
	
	public Exercise(int max) {
		super();
		this.max = max;
	}
	@Override
	public void run() {
		try {
		while(max>0) {
			if(max%2==0) {
				System.out.println(max);				
				Thread.sleep(1000);				
			}
		max--;
		}
		}catch(Exception e) {
			
		}
	}
	

	public static void main(String[] args) {
		Exercise exercise = new Exercise(10);
		exercise.start();
		Exercise exercise2 = new Exercise(20);
		exercise2.start();
	}
}
