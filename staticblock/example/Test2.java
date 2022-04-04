package com.tyss.staticblock.example;

public interface Test2 {
	default void message() {
		System.out.println("hello");
	}
}
