package com.BasicCommands.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _15HandlingAuthentication_Firefox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://perforce.ic.ncs.com/");

	}

}
