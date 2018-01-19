package com.one;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelOne {
    @Test
	public static void test() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette", "D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
			
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nare4252@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("");
		WebElement Login = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		Login.click();
		System.out.println("********EXECUTED************");

	}

}
