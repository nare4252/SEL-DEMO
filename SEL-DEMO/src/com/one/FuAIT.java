package com.one;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.annotations.Configuration;

public class FuAIT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/nare4/Desktop/NARE.html");
		driver.findElement(
				By.xpath("//input[@type='1' or @name='resumeupload']")).click();
		try {
			Runtime.getRuntime().exec(
					"C:\\Users\\nare4\\Desktop\\Autoit\\upload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
