package com.BasicCommands.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class _11ActionsClass_MouseHoverClick {
/*	//1. First find the webelement
	  2. Write code for actions class and pass driver instance
	  3. then using action ref variable movetothat element i.e actio.moveToElement(webelement).click().perform();
      4. Then once the subelemnt is active click on it using Find elements*/
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//First Example - www.actimind.com
		driver.navigate().to("http://www.actimind.com/");
		WebElement about_company = driver.findElement(By.xpath("//span[text()='Products & Services']"));
		Actions action = new Actions(driver);
		action.moveToElement(about_company).perform();
		Thread.sleep(10);
		driver.findElement(By.xpath("//a[text()='Mobile Applications']")).click();
		//------------------------------------------------------------------------------------------------------------
		//Second Example - www.myhcl.com
		driver.navigate().to("http://www.myhcl.com/");
		driver.findElement(By.id("txtUserID")).sendKeys("ranjithkumar.b");
		driver.findElement(By.id("txtPassword")).sendKeys("Sep2016s");
		WebElement we = driver.findElement(By.id("ddlDomain"));
		Select sel = new Select(we);
		sel.selectByIndex(2);
		driver.findElement(By.id("btnSubmit")).click();
		WebElement fav = driver.findElement(By.xpath("//a[text()='My Favorites ']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(fav).click().perform();
		driver.findElement(By.xpath("//a[text()='My Profile (ESS)']")).click();
	}
}