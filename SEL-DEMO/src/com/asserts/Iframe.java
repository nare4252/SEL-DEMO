package com.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.annotations.Configuration;

public class Iframe extends Configuration{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		int size = driver.findElements(By.tagName("video-masthead-video-player-clicktarget")).size();
		
	}

}
