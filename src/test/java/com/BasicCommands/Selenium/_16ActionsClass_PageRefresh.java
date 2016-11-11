package com.BasicCommands.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _16ActionsClass_PageRefresh {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Ranjith");
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	}
}
