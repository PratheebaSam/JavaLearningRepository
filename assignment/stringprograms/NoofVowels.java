package com.tyss.assignment.stringprograms;

import java.util.Scanner;

public class NoofVowels {
	public static void main(String[] args) {
		String str;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total Number Vowels in a String :" + count);
	}
}
