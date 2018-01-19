package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Bufferedoutputstream {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\nare4\\Desktop\\output.txt");
		String string = "Welcome";
		byte[] b = string.getBytes();
		
	}

}
