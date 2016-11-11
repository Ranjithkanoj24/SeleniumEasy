package com.BasicCommands.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class _04SelectMethods_DropDown {
	//We use LIST interface to store the list of elements i.e 
	//List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file://C:/Users/ranjithkumar.b/Desktop/Sample.html");
		WebElement select = driver.findElement(By.name("dropdown"));
		Select sel = new Select(select);
		sel.selectByIndex(0); // Select ny Index
		Thread.sleep(2000);
		// selectByValue - Takes value of value Attribute
		sel.selectByValue("dd5"); //Select by value
		Thread.sleep(2000);
		// selectByVisibleText - Takes visible text of the element
		sel.selectByVisibleText("Drop Down Item 6"); //Select by visible text
		/*//Similarly we have methods to de-select also
		sel.deselectAll();sel.deselectByIndex(index);sel.deselectByValue(value);
		sel.deselectByVisibleText(text);*/
		
		//How to print all the options present in the drop down
		List<WebElement> list = sel.getOptions();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
		//How to get the name of the selected element
		System.out.println(sel.getFirstSelectedOption().getText());
		
		/*Additional Method of Select includes
		1. Method Name: getOptions
		Syntax: select.getOptions ();
		List<WebElement> allOptions = se.getOptions();
		Returns: List
		Purpose: Returns all the option elements displayed in this select tag (dropdown list)
		
		2. Method Name: getAllSelectedOptions
		Syntax: select.getAllSelectedOptions();
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		Returns: List
		Purpose: It will return all the option elements that are selected in the select tag.
				
     	3. Method Name: getFirstSelectedOption
	 	Syntax: Select.getFirstSelectedOption();
	 	WebElement firstOption = se.getFirstSelectedOption();
		Returns: WebElement 
		Purpose:  It will return the first selected option in this 
				select tag (or the currently selected option in a normal select)

		4. Syntax: select.isMultiple ();
		if(se.isMultiple())
		Returns: Boolean
		Purpose: To check whether the Select element supports
		selecting multiple options. This will be done by 
		checking the value of the "multiple" attributes in Select tag.*/

	}

}
