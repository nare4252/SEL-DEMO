package com.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTheTitleOfPage {
	
	@Test
	public void testNGAsserts() throws InterruptedException{
		System.setProperty("webdriver.firefox.marionette", "D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Test Condition 1:- If Page title matches with actualTitle then it finds email title and enters the value which we pass		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String actualTitle = "Gmail";
		Assert.assertEquals(driver.getTitle(), actualTitle);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("nare4252@gmail.com");
		
		//Test Condition 2: If page title didnt match with actualTitle then script throws an exception
		Thread.sleep(2000);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		actualTitle = "Gmail";
		Thread.sleep(2000);
		
		//Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
		Assert.assertEquals(driver.getTitle(), actualTitle);
	}
}
