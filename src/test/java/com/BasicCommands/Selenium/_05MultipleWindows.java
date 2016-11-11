package com.BasicCommands.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class _05MultipleWindows {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		_05MultipleWindows multWindows = new _05MultipleWindows();
		String windowTitle = multWindows.getWindowTitle(driver);
		System.out.println(windowTitle);
		String mainWindow = multWindows.getMainWindow(driver);
		System.out.println(mainWindow);
		Assert.assertTrue(closeOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment - Job Search"), "Main window title is not matching");
		System.out.println("Completed");
		
	}

	public String getWindowTitle(WebDriver driver) {
		System.out.println("Entered getWindowTitle Method");
		return driver.getTitle();
	}

	public String getMainWindow(WebDriver driver) {
		System.out.println("Entered getMainWindow Method");
		return driver.getWindowHandle();
	}

	public static boolean closeOtherWindows(String mainWindow1) {
		System.out.println("Entered mainWindow1 Method");
		Set<String> windowHandles = driver.getWindowHandles();
		for (String getWindow : windowHandles) {
			if (!mainWindow1.equals(getWindow)) {
				driver.switchTo().window(getWindow);
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow1);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

}
