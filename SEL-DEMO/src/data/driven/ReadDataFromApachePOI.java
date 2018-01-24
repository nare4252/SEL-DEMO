package data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.dev.ReSave;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.annotations.Configuration;

import jxl.Cell;
import jxl.Sheet;

public class ReadDataFromApachePOI {
	String URI = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	WebDriver driver;
	
	@BeforeTest
	public void initilization(){
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ustuser\\Desktop\\Test\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URI);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void gmailLogin() throws Exception{
//		File file = new File("C:\\Users\\nare4\\Desktop\\Test\\poi.xlsx");
		File file = new File("C:\\Users\\ustuser\\Desktop\\poi.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheetAt(0);
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath(".//*[@id='identifierId']")).clear();
			driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
			
			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(cell.getStringCellValue());
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
			driver.findElement(By.cssSelector(".iUe6Pd.Us7fWe.JhUD8d")).click();
			driver.findElement(By.xpath(".//*[@id='identifierLink']")).click();
			
			
		}
	}
	
	@AfterMethod
	public void screenShotOfFailedTestCase(ITestResult result){
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(source, new File("C:\\Users\\ustuser\\Desktop\\Test\\ScreenShots"+result.getName()+".png"));
			} catch (IOException e) {
				System.out.println("Screenshot is taken for failed testcase");
				e.printStackTrace();
				System.out.println("Exception while taking screenshot"+e.getMessage());
			}
		}
	}
}

























