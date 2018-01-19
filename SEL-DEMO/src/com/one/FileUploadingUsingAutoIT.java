package com.one;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.annotations.Configuration;

public class FileUploadingUsingAutoIT extends Configuration{
	
	Runtime rt;
	
	@Test
	public void fileUploadingUsingAutoIT() throws IOException{
		chromeProperty();
		driver.get("file:///C:/Users/nare4/Desktop/NARE.html");
		driver.findElement(By.xpath("//input[@id='1' or @name='resumeupload']")).click();
		rt.getRuntime().exec("C:\\Users\\nare4\\Desktop\\Autoit\\Fileupload.exe");
		
	}
}
