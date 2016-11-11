package com.AdvancedCommands.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _01JavaSciptExecutor_ScrolldownPage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.linkedin.com/");
		Thread.sleep(2000);
	}
	//Scrolling to the bottom of the page
	@Test(priority=1)
	public void scrollingToBottomofAPage(){
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	// Scroll to particular element and peform operations on that particular element
	@Test(priority=2)
	public void scrollingToElement() throws InterruptedException{
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.linkText("Create Page"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", we);
	}
	@Test(priority=3)
	public void scrollOnCoordinates() throws InterruptedException{
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("What Do I mean");
		driver.findElement(By.className("sbico")).click();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	}
	//The more better way to do this is having a utils class and define reusable methods.
	// We can call these methods from different classes/tests
	public void scrollDownPage(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
