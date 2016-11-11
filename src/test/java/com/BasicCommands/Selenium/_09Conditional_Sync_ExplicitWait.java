package com.BasicCommands.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*	Explicit wait for state drop down field
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("statedropdown")));
The above statement waits up to 10 seconds before throwing Exception 
(TimeoutException - Timed out after 10 seconds waiting for visibility of element)
or if it finds the element, it will return in 0 - 10 seconds.*/
public class _09Conditional_Sync_ExplicitWait {
	public WebDriver driver;
	@BeforeClass
	public void setUp(){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}
	@Test
	public void GetPageTitle(){
		driver.navigate().to("https://www.google.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gsfi"))).sendKeys("Hello World");
		driver.findElement(By.className("sbibod ")).click();
		
	} 
}
