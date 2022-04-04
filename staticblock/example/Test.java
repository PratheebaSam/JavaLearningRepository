package com.tyss.staticblock.example;

public interface Test {
	default void message() {
		System.out.println("hi");
	}
}
