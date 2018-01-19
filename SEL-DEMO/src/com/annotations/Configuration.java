package com.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Configuration {
	
	//Firefox Driver
	String firefoxDriver = "webdriver.firefox.marionette";
	String geckoDriver = "D:\\Softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	
	//Chrome Driver
	String chromeDriver = "webdriver.chrome.driver";
	String pathChrome = "D:\\Softwares\\chromedriver.exe";
	
	//Web Driver
	public WebDriver driver;
	
	//Configuring the firefoxDriver
	public void firefoxProperty(){
		System.setProperty(firefoxDriver, geckoDriver);
		driver = new FirefoxDriver();
	}
	
	//Configuring the chromeDriver
	public void chromeProperty(){
		System.setProperty(chromeDriver, pathChrome);
		driver = new ChromeDriver();
	}
}
