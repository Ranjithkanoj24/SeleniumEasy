package com.BasicCommands.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class _10aDifferent_ExplicitWaitCombos {
	public WebDriver driver;
	
	/*-----------------------------------------------------------------------1.isElementPresent:---------------------------------------------------------------------
	Below is the syntax to check for the element presence using WebDriverWait.
	 Here we need to pass locator and wait time as the parameters to the below method. 
	Here it is checking that an element is present on the DOM of a page or not. 
	That does not necessarily mean that the element is visible. 
	ExpectedConditions will return true once the element is found in the DOM.

	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
	We should use presenceOfElementLocated when we don't care about the element visible or not, 
	we just need to know if it's on the page.

	We can also use the below syntax which is used to check if the element is present or not.
	 We can return true ONLY when the size of elements is greater than Zero. That mean there exists at least one element.

	WebElement element = driver.findElements(By.cssSelector(""));
	element.size()>0;

	--------------------------------------------------------2.ElementClickable----------------------------------------------------------------------
	Below is the syntax for checking an element is visible and enabled such that we can click on the element.
    We need to pass wait time and the locator as parameters.

	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait.until(ExpectedConditions.elementToBeClickable(locator));

	--------------------------------------------------------3.isElementVisible----------------------------------------------------------------------
	Below is the syntax to check if the element is present on the DOM of a page and visible. 
	Visibility means that the element is not just displayed but also should also has a height 
	and width that is greater than 0.
	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	We can also use the below to check the element to be visible by WebElement.

	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait..until(ExpectedConditions.visibilityOf(element));
	We can also use the below to check all elements present on the web page are visible. 
	We need to pass list of WebElements.

	List<WebElement> linkElements = driver.findelements(By.cssSelector('#linkhello'));
	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait..until(ExpectedConditions.visibilityOfAllElements(linkElements));

	--------------------------------------------------------4.isElementInVisible----------------------------------------------------------------------
	Below is the syntax which is used for checking that an element is either invisible or not present on the DOM.

	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(locator)); 
	--------------------------------------------------------5.isElementEnabled----------------------------------------------------------------------
	Below is the syntax which is used to check if the element is enabled or not
	WebElement element = driver.findElement(By.id(""));
	element.isEnabled();
	--------------------------------------------------------6.isElementDisplayed----------------------------------------------------------------------
	Below is the syntax which is used to check if the element is displayed or not. 
	It returns false when the element is not present in DOM.

	WebElement element = driver.findElement(By.id(""));
	element.isDisplayed();
	--------------------------------------------------------7.Wait for invisibility of element---------------------------------------------------------------------
	Below is the syntax which is used to check for the Invisibility of element with text

	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait.until(ExpectedConditions.invisibilityOfElementWithText(by));
	--------------------------------------------------------8.Wait for invisibility of element with Text--------------------------------------------------------------
	Below is the syntax which is used for checking that an element with text is 
	either invisible or not present on the DOM.

	WebDriverWait wait = new WebDriverWait(driver, waitTime);
	wait.until(ExpectedConditions.invisibilityOfElementWithText(by, strText));
*/

}
