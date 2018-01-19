package com.annotations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.UploadFile;
import org.testng.annotations.Test;

public class DownloadUsingRobotClass extends Configuration {

	@Test
	public void downloadFile() throws AWTException, InterruptedException {
		chromeProperty();
		
		//set location
		StringSelection selection = new StringSelection("C:\\Users\\nare4\\Desktop\\Tickets\\25-01-2018.pdf");
		
		//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		driver.get("file:///C:/Users/nare4/Desktop/NARE.html");
		driver.findElement(By.xpath("//input[@id='1' or name='resumeupload']"))
				.click();
		
		//Robot class
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
