package com.exec;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMessageUtils {
	String message = "HelloWorld";
	MessageUtils messageUtils;
	
	@Test(priority = 0)
	public void printMessage(){
		messageUtils = new MessageUtils(message);
		Assert.assertEquals(message, messageUtils.printMessage());
	}
	
	@Test(priority = 1)
	public void printMessageOne(){
		messageUtils = new MessageUtils(message);
		Assert.assertEquals(message, messageUtils.printMessage());
	}
}
