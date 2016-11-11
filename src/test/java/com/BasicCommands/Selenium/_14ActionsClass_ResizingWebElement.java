package com.BasicCommands.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _14ActionsClass_ResizingWebElement {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/resizable/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		WebElement resize = driver
				.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		Thread.sleep(2000);
		resizeMethod(resize, 1, 7);
		Thread.sleep(2000);
		System.out.println("Completed Execution");
	}
	public static void resizeMethod(WebElement element, int xOffSet, int yOffSet) {
		try {
			if (element.isDisplayed()) {
				Actions action = new Actions(driver);
				action.clickAndHold(element).moveByOffset(xOffSet, yOffSet).release().build().perform();

			} else {
				System.out.println("The element is not displayed as such to drag");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not active : " + e.getStackTrace());
		}

		catch (Exception e) {
			System.out.println("Element not found : " + e.getStackTrace());
		}
	}
}