package com.tyss.exceptionhandling.throwsexception;

import java.io.File;
import java.io.FileReader;

public class CalledMethod {
	public String task(File file) throws Exception{
		String s="";
			FileReader fileReader = new FileReader(file);
			int read=fileReader.read();
			while(read !=-1) {
				s+=(char) read;
				read=fileReader.read();
			}
		return s;
	}
}
