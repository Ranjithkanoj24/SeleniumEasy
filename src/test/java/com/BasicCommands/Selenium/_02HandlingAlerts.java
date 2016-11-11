package com.BasicCommands.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//Working with Alerts using Selenium Webdriver:
		driver.get("file:///C:/Users/ranjithkumar.b/Desktop/Alert.html");
		driver.findElement(By.xpath("//button[text()='Click on me']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		//Working with "Confirmation Popups"
		Thread.sleep(3000);
		driver.navigate().to("file:///C:/Users/ranjithkumar.b/Desktop/Confirmation Popup.html");
		driver.findElement(By.xpath("//button[text()='Click on me']")).click();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		
		//Working with "Prompt Popups"
		driver.navigate().to("file:///C:/Users/ranjithkumar.b/Desktop/Prompt Popup.html");
		driver.findElement(By.xpath("//button[text()='Click on me']")).click();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("Ranjith");
		Thread.sleep(3000);
		alert.accept();
	}
	

}
