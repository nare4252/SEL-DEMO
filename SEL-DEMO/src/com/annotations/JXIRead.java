package com.annotations;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXIRead {

	public static void main(String[] args) throws Exception {
		File source = new File("C:\\Users\\nare4\\Desktop\\scr\\nare.xls");
		System.out.println("Excel located");
		
		Workbook workbook = Workbook.getWorkbook(source);
		
		
		System.out.println("workbook loaded");
		
		String string = workbook.getSheet(0).getCell(0, 0).getContents();
		System.out.println(string);
		
		String string2 = workbook.getSheet(0).getCell(0, 1).getContents();
		System.out.println(string2);
		
		String string3 = workbook.getSheet(0).getCell(1, 0).getContents();
		System.out.println(string3);
		
		String string4 = workbook.getSheet(0).getCell(1, 1).getContents();
		System.out.println(string4);
		
		String rowtwo = workbook.getSheet(0).getCell(2, 0).getContents();
		System.out.println(rowtwo);
		
		String string6 = workbook.getSheet(0).getCell(2, 1).getContents();
		System.out.println(string6);
		
	}

}
