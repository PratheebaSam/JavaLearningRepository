package com.tyss.abstractclass.example1;

public class Emmi extends Pet{
	@Override
	void sound() {
		System.out.println("Meow Meow");
		
	}

	@Override
	void food() {
		System.out.println("drinking milk");
		
	}

	@Override
	void play() {
		System.out.println("play hihde and seek");
		
	}
	public void fight() {
		System.out.println("fighting with rat");
	}
}
