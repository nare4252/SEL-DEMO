package com.annotations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {

	String chromeDriver = "webdriver.chrome.driver";
	String pathChrome = "D:\\Softwares\\chromedriver.exe";
	WebDriver driver;

	@Test(dataProvider = "wordpressData")
	public void wordPress(String userName, String passWord)
			throws InterruptedException {
		System.setProperty(chromeDriver, pathChrome);
		driver = new ChromeDriver();

		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(
				By.xpath("//input[@id='user_login' and @class='input' ]"))
				.sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(
				passWord);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "false");
		System.out.println("true");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider(name = "wordpressData")
	public Object[][] passData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "admin1";
		data[0][1] = "demo1";

		data[1][0] = "admin";
		data[1][1] = "demo123";

		data[2][0] = "admin2";
		data[2][1] = "demo1234";

		return data;
	}
}
