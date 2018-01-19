package com.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.annotations.Configuration;

public class HandleUntrustedSite extends Configuration {

	@Test
	public void usingChrome() {

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		capabilities.setBrowserName("safari");
		String string = capabilities.getBrowserName();
		System.out.println(string);

	}

	@Test
	public void usingFirefox() {
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setAcceptUntrustedCertificates(true);
		firefoxProperty();
		driver.get("https://expired.badssl.com/");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("chrome");
		String string = capabilities.getBrowserName();
		System.out.println(string);

	}
}
