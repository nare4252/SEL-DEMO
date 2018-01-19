package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Fileinputstream_Two {

	public static void main(String[] args) throws IOException {
		// String string = "C:\\Users\\nare4\\Desktop\\output.txt";
		//
		// Stream<String> stream = Files.lines(Paths.get(string));
		//
		// stream.forEach(System.out::println);
		//
		// }

		File file = new File("C:/robots.txt");

		try (FileInputStream fis = new FileInputStream(file)) {

			System.out.println("Total file size to read (in bytes) : "
					+ fis.available());

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

// In java 7 example

// public static void main(String[] args) {
//
// File file = new File("C:/robots.txt");
//
// try (FileInputStream fis = new FileInputStream(file)) {
//
// System.out.println("Total file size to read (in bytes) : "+ fis.available());
//
// int content;
// while ((content = fis.read()) != -1) {
// // convert to char and display it
// System.out.print((char) content);
// }
//
// } catch (IOException e) {
// e.printStackTrace();
// }
// }