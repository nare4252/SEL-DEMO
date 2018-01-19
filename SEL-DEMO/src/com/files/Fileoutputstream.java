package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream {

	public static void main(String[] args) throws FileNotFoundException {
		
			FileOutputStream fileoutputstream = new FileOutputStream("C:\\Users\\nare4\\Desktop\\output.txt");
			try {
				fileoutputstream.write(65);
				fileoutputstream.close();
				System.out.println("Success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
