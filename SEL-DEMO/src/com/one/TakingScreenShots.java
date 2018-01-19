package com.one;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.annotations.Configuration;

public class TakingScreenShots {
	WebDriver driver;

	@Test
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		try {
			driver.findElement(By.xpath(".//*[@id='if']")).sendKeys("testing");
		} catch (Exception e) {
			System.out.println("Exec");
			getScreenShot();
		}

	}

	public void getScreenShot() throws Exception {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(
				"c:\\Users\\nare4\\Desktop\\google.png"));
	}

}
