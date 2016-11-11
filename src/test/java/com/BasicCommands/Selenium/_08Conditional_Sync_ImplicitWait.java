package com.BasicCommands.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _08Conditional_Sync_ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		/*
		1. The default setting is 0. Once when we define the implicit wait, it will set for the life of the WebDriver object instance.
		2. It is a mechanism which will be written once and applied for entire session automatically.
		It should be applied immediately once we initiate the Webdriver.
		3. Implicit wait will not work all the commands/statements in the application. 
		It will work only for "FindElement" and "FindElements" statements.
		4. If we set implicit wait, find element will not throw an exception if the element is not found in first instance,
		instead it will poll for the element until the timeout and then proceeds further. 
		We should always remember to add the below syntax immediately below the Webdriver statement.*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
