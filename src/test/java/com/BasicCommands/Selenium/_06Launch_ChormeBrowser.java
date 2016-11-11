package com.BasicCommands.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Down Chrome Executable from this site http://www.seleniumhq.org/download/ chromedriver_win32.zip
public class _06Launch_ChormeBrowser {
	public WebDriver driver;
	@BeforeClass
	public void setUp(){
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPageTitle(){
		driver.navigate().to("http://www.google.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(pageTitle.equalsIgnoreCase("Google"), "Page does not match");
	}

	@AfterTest
	public void tearDown(){
		if(driver!=null)
			System.out.println("Closing Chrome Browser");
			driver.close();
	}

}
