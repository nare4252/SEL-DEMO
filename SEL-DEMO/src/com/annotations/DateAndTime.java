package com.annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DateAndTime extends Configuration {
	
	@Test
	public void facebookTest1() {
		firefoxProperty();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nare4252");
	}
	
	@Test
	public void facebookTest2(){
		chromeProperty();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nare4252");
	}
}
