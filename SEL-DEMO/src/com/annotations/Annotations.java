package com.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;
	String URL = "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	String firefoxDriver = "webdriver.firefox.marionette";
	String geckoDriver = "D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	
	//launching fire fox browser
	@BeforeTest
	public void launchBrowser(){
		System.out.println("Launching browser");
		System.setProperty(firefoxDriver, geckoDriver);
		driver = new FirefoxDriver();
		driver.get(URL);
	}
	
	@Test
	public void testTitle(){
		String expectedTitle = "Gmail";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void terminateBrowser() throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}
}
