package com.BasicCommands.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _10bExplicitWait_Demo {
	public WebDriver driver;
	@BeforeClass
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.gmail.com");
	}
	
	@Test
	public void loginLogout() throws InterruptedException{
		//driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.id("Email")).sendKeys("ranjithkumar9.b");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("ranjith@9",Keys.ENTER);
		//-----------------------------Expiclit Wait----------------------------------------------------------
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='COMPOSE']")));
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		//-----------------------------------------------------------------------------------------------------
		
	}
	
	/*public static void explicitWaitMethod(WebDriver driver, String logout_liml1){
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id(logout_liml1))); 
	}*/
	
	public void tearDown(){
		if(driver!=null){
			driver.close();
		}
	}

}
