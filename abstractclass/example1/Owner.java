package com.tyss.abstractclass.example1;

//here loose coupling is achieved by abstract.
//changing the name of constructor we achieve the loose coupling

public class Owner {
	public static void main(String[] args) {
		Pet p=new Jack();
		p.sound();
		p.food();
		p.play();
		
		Pet p1=new Emmi();
		p1.sound();
		p1.food();
		p1.play();
		
		Emmi p2=(Emmi) p1;
		p2.fight();
		p2.food();
	}
	
}
