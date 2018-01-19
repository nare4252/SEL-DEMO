package com.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptexecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.xpath("//input[@id='u_0_2' or @type='submit']"));

		executor.executeScript("arguments[0].click()", element);
		executor.executeScript("alert('Welcome to Guru99');");   

	}

}
