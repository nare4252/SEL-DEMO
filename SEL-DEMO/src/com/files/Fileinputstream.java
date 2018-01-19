package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinputstream {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\nare4\\Desktop\\output.txt");
		int i = fileInputStream.read();
		
		System.out.println((char)i);
	}

}
