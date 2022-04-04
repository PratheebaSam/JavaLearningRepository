package com.tyss.exceptionhandling.handling1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		System.out.println("program started");
		File fr=new File("");
		try {
			FileReader fileReader = new FileReader(fr);
			int read=fileReader.read();
			while(read !=-1) {
				System.out.println((char) read);
				read=fileReader.read();
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program ends");
	}
}
