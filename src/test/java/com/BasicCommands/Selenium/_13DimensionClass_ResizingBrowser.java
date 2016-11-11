package com.BasicCommands.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _13DimensionClass_ResizingBrowser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(1024,1024);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		Dimension d1 = new Dimension(102,102);
		driver.manage().window().setSize(d1);
		System.out.println(driver.manage().window().getSize());
	}

}
