package com.one;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import jxl.Workbook;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WritingJXL {
	private static final String EXCEL_FILE_LOCATION = "C:\\Users\\nare4\\Desktop\\scr\\nare.xls";
	
	public static void main(String[] args) throws RowsExceededException, WriteException {
		File file = new File(EXCEL_FILE_LOCATION);
		try {
			
			//Creating workbook
			WritableWorkbook sheet = Workbook.createWorkbook(file);
			
			//Creating Sheet
			WritableSheet createSheet = sheet.createSheet("Sheet 1", 0);
			
			Label label = new Label(0, 0, "pass");
			Label label2 = new Label(1, 0, "pass");
			Label label3 = new Label(2, 0, "pass");
			Label label4 = new Label(3, 0, "pass");			
			DateTime dateTime = new DateTime(4, 0, new Date());
			
			
			createSheet.addCell(label);
			createSheet.addCell(label2);
			createSheet.addCell(label3);
			createSheet.addCell(label4);
			createSheet.addCell(dateTime);
			
			sheet.write();
			sheet.close();
			
			System.out.println("Success");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
