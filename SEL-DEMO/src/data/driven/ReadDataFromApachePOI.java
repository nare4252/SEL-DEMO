package data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.annotations.Configuration;

import jxl.Cell;
import jxl.Sheet;

public class ReadDataFromApachePOI extends Configuration{
	String URI = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	
	@BeforeTest
	public void initilization(){
		
		//Calling the method to run the chrome browser fro configuration class
		chromeProperty();
		
		//To Open an URI
		driver.get(URI);
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void fbLogin() throws Exception{
		File file = new File("C:\\Users\\nare4\\Desktop\\Test\\poi.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		sheet = workbook.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath("//input[@id='identifierId' and @class='whsOnd zHQkBf']")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();			
			
			
		}
	}
}
