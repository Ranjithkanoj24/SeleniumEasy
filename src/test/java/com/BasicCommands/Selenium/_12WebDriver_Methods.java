package com.BasicCommands.Selenium;

public class _12WebDriver_Methods {
	/*We will look in detail for each of the webdriver methods that we have. 
	The first that we use is 'driver.get(url)' after starting the browser.

	When we get the driver object, the below are the methods that we can perform operation on a driver.
	In IDE like eclipse, when we enter driver. and click on space bar, it will show all the below methods.
	get()
	getCurrentUrl();
	getTitle()
	findElements()
	findElement()
	getPageSource()
	close()
	quit()

	1. Method Name :- get()
	Syntax: get(url)
	Example: driver.get();
	Purpose: It will load a new web page in the current browser window. This is done using an http get operation, and the method will block until the load is complete.
	Parameters: URL - The URL to load and it should be a fully qualified URL

	2. Method Name: getCurrentUrl()
	Syntax: getCurrentUrl()
	Example: driver.getCurrentUrl();
	Purpose: Gets a string representing the current URL that the browser is opened.
	Returns: The URL of the page currently loaded in the browser

	3. Method Name: getTitle()
	Syntax: getTitle()
	Example: driver.getTitle();
	Purpose: Gets the title of the current web page.
	Returns: The title of the current page, with leading and trailing white space stripped, or null if one is not already set

	4. Method Name: findElements()
	Syntax: findElements(By by)
	Example: driver.findElements(By.xpath("//");
	Purpose: Find all elements within the current page using the given mechanism.
	Parameters: By - The locating mechanism to use
	Returns: A list of all WebElements, or an empty list if nothing matches

	5. Method Name: findElement()
	Syntax: WebElement findElement(By by)
	Example: driver.findElements(By.xpath("//");
	Purpose: Find the first WebElement using the given method.
	Parameters: By - The locating mechanism
	Returns: The first matching element on the current page
	Throws: NoSuchElementException - it will return exception if no matching elements are found

	6. Method Name: getPageSource()
	Syntax: getPageSource()
	Example: driver.getPageSource();
	Purpose: Get the source of the currently loaded page. If the page has been modified after loading (for example, by Javascript) there is no guarantee that the returned text is that of the modified page.
	Returns: The source of the current page

	7. Method Name: close()
	Syntax: void close()
	Example: driver.close();
	Purpose: Close the current window, if there are multiple windows, it will close the current window which is active and quits the browser if it's the last window opened currently.

	8. Method Name: quit()
	Syntax: void quit()
	Example: driver.quit();
	Purpose: Quits this driver instance, closing every associated window which is opened.

	9. Method Name: getWindowHandles()
	Syntax: Set getWindowHandles()
	Example: driver.getWindowHandles();
	Purpose: Return a set of window handles which can be used to iterate over all the open windows of this Webdriver instance by passing them to switchTo().WebDriver.Options.window()
	Returns: A set of window handles which can be used to iterate over all the open windows.

	10. Method Name: getWindowHandle()
	Syntax: String getWindowHandle()
	Example: driver.getWindowHandle();
	Parameter: Return an opaque handle to this window that uniquely identifies it within this driver instance. This can be used to switch to this window at a later date
	switchTo
	WebDriver.TargetLocator switchTo()
	The next future commands will be performed to a different frame or window.
	Returns: A Target Locator which can be used to switch or select a frame or window

	11. Method Name: navigate()
	Syntax: WebDriver.Navigation navigate()
	Example: driver.navigate.to("");
	Purpose: An abstraction allowing the driver to access the browser's history and to navigate to a given URL.
	Returns: A WebDriver.Navigation that allows the selection of what to do next

	12. Navigate.To(URL)
	Method Name: navigate.to(URL)
	Syntax: driver.navigate().to(URL);
	Purpose: This methods Load a new web page in the current browser window. This is done using an HTTP GET operation, and the method will block until the load is complete.
	Parameters: URL – It should be a fully qualified URL.

	13. Navigate.To(String)
	Method Name: navigate.to(String)
	Syntax: driver.navigate().to(String);
	Purpose: This methods Load a new web page in the current browser window. It is an Overloaded version of to(String) that makes it easy to pass in a URL.
	Parameters: URL String

	14. Navigate.Back()
	Method Name: navigate().back()
	Syntax: driver.navigate().back();
	Purpose: To move back a single "item" in the web browser's history. And it will not perform any action if you are on the first page viewed.
	Parameters: N/A

	15. Navigate.Forward()
	Method Name: navigate().forward()
	Syntax: driver.navigate().forward();
	Purpose: To move a single "item" forward in the web browser's history. And it will not perform any action if we are on the latest page viewed.
	Parameters: N/A

	16. Navigate.Refresh()
	Method Name: navigate().refresh()
	Syntax: driver.navigate().refresh();
	Purpose: It refreshes the current web page
	Parameters: N/A

	17. Method Name: manage()
	Syntax: WebDriver.Options manage()
	Purpose: Gets the Option interface
	Returns: An option interface*/

}
