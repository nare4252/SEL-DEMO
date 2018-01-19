package com.one;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.annotations.Configuration;

public class TakingScreenshotOfFailedTestCase extends Configuration{

	@Test
	public void testChrome() {
		chromeProperty();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='email and @class='inputtext' and @data-testid='royal_email']"));
		element.sendKeys("nare4252");
		
	
		
		
	}
	
	@AfterMethod
	public void takeScreenShot(ITestResult result){
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(source, new File("C:\\Users\\nare4\\Desktop\\New folder (2)"+result.getName()+".png"));
				System.out.println("Screenshot Taken");
			} catch (IOException e) {
				System.out.println("Exception while taking screenshot"+e.getMessage());
				
			}
		}
	}

}
