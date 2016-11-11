package com.BasicCommands.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _03FileUpload_SendKeys {

	public static void main(String[] args) throws InterruptedException {
		//Below code will not work if Attachment Icon is present instead of Browse button.
		//like in Gmail. In such cases we use AutoIt function.
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.2shared.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("absmid")).sendKeys("C:\\Users\\ranjithkumar.b\\Desktop\\Testcases Uploading_qtest.xls");

	}

}
