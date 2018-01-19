package com.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.annotations.Configuration;


public class Download {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/smiley_chart/");
		driver.findElement(By.linkText("smilechart.xls")).click();
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
}
