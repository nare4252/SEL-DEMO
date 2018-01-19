package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream_One {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\nare4\\Desktop\\output.txt");
		String string = "Now iam going to eat panipuri";
		byte b[] = string.getBytes();
		
		try {
			fileOutputStream.write(b);
			fileOutputStream.close();
			
			System.out.println("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
