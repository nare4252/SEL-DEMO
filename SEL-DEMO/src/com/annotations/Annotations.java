package com.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Configuration{
	WebDriver driver;
	String URL = "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	
	
	//Before test
	@BeforeTest
	public void launchBrowser(){
		System.out.println("Launching browser");
		System.setProperty(firefoxDriver, geckoDriverOffice);
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
