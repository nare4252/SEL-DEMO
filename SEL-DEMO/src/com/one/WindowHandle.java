package com.one;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.annotations.Configuration;

public class WindowHandle extends Configuration{
	
	@BeforeTest
	public void beforeTest(){
		chromeProperty();
		driver.get("https://www.naukri.com");
	}
	
	@Test
	public void windowHandle(){
		String parent = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> iterator = s1.iterator();
		
		while (iterator.hasNext()) {
			String child = (String) iterator.next();
			
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				
			}
			
		}
		driver.switchTo().window(parent);
		
	}
}
