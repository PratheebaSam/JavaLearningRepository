package com.tyss.staticblock.example;

public interface Example {
	default void test() {
		System.out.println("hello");
	}
	static void message() {
		System.out.println("hi");
	}
}
