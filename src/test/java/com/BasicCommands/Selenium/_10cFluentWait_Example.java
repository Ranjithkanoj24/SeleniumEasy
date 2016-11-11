package com.BasicCommands.Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/*Using FluentWait we can define the maximum amount of time to wait for a condition, 
as well as the frequency with which to check for the condition.
And also the user can configure to ignore specific types of exceptions 
such as "NoSuchElementExceptions" when searching for an element. 
NoSuchElement exception is thrown by findElement(By) and findElements(By). 
When ever it try to find any element it returns the first matching element on the current page 
else it throws NoSuchElementException - when no matching elements are found.*/
public class _10cFluentWait_Example {
WebDriver driver;
	
	public void method1(){
		driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.guru99.com/");
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("guru")) {
			System.out.println("The page title is matching");
		} else {
			System.out.println("The page title is NOT matching");
		}
		//FluentWait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		//Finding an element
		
	}
	
	/*private static WebElement findElement(final WebDriver driver, final By locator, final int timeoutSeconds) {
	    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(timeoutSeconds, TimeUnit.SECONDS)
	            .pollingEvery(500, TimeUnit.MILLISECONDS)
	            .ignoring(NoSuchElementException.class);

	    return wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver webDriver) {
	            return driver.findElement(locator);
	        }
	    });
	}
	*/
	

}
