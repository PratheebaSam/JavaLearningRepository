package com.tyss.hasarelationship.usinglaptop;

public class OnlineShop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		Battery battery = new Battery();
		battery.brand="Dell";
		battery.capacity=20000;
		battery.type="lithium";
		
		Rom rom = new Rom();
		rom.clockSpeed=2.4;
		rom.size=16;
		rom.type="DDR4";
		
		Screen screen = new Screen();
		screen.brand="Samsung";
		screen.resolution=1080;
		screen.size=32;
		screen.type="oled";
		
		
		laptop.brand="hp";
		laptop.price=100000;
		laptop.rom=rom;
		laptop.screen=screen;
		laptop.battery=battery;
		
		System.out.println(laptop);
	}
}
