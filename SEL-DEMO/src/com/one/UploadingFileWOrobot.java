package com.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadingFileWOrobot {
	@Test
	public static void testUpload() {
		System.setProperty("webdriver.firefox.marionette", "D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://encodable.com/uploaddemo/");
		WebElement element = driver.findElement(By.xpath(".//*[@id='uploadname1']"));
		element.sendKeys("C:\\Users\\nare4\\Desktop\\nare.txt");
		
		driver.findElement(By.xpath(".//*[@id='newsubdir1']"));
		
	
		
		

	}

}
