package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.annotations.Configuration;

public class Login extends Configuration{
	
	// Declaring 
	By userID = By.xpath("");
	By userPass = By.xpath("");
	By titleText = By.xpath("");
	By submitButton = By.xpath("");
	
	public Login(WebDriver driver){
		this.driver = driver;
	}
	
}
