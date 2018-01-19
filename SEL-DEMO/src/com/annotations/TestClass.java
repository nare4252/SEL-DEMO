package com.annotations;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class TestClass extends Configuration {

	@Test
	public void testOne() throws InterruptedException {
		chromeProperty();
		driver.get("https://www.naukri.com");

		String mainWindow = driver.getWindowHandle();
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		Set<String> childWindow = driver.getWindowHandles();

		Iterator<String> iterator = childWindow.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(string);
				System.out.println(driver.switchTo().window(string).getTitle());

			}

		}
		driver.switchTo().window(mainWindow);

		WebElement click = driver.findElement(By
				.xpath("//span[@class='topIcon jobs Login']"));
		executor.executeScript("arguments[0].click()", click);

		
		WebElement element = driver.findElement(By
				.xpath("//input[@id='eLogin' and @type='text']"));
		element.sendKeys("hello");
		WebElement element2 = driver.findElement(By
				.xpath("//input[@id='pLogin' and @type='password']"));
		element2.sendKeys("hello");
		WebElement element3 = driver.findElement(By.cssSelector("#pLogin"));

		executor.executeScript("arguments[0].click()", element3);
		executor.executeAsyncScript("alert('Welcome to naukri')");

	}
	
	@AfterMethod
	public void takeScreenShot(ITestResult iTestResult){
		if (ITestResult.FAILURE == iTestResult.getStatus()) {
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(source, new File("C:\\Users\\nare4\\Desktop\\scr\\"+iTestResult.getName()+".png"));
			} catch (IOException e) {
				System.out.println("Exception while taking screenshot"+e.getMessage());
			}
			
			
		}
	}

}
