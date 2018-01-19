package com.annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOnlineForm extends Configuration{
	
	@BeforeTest
	public void testOLformOne(){
		chromeProperty();
		driver.get("https://www.jotform.com/build/80141219784456#preview");
	}
	
	@Test
	public void testOLformTwo(){
		
	}
}
