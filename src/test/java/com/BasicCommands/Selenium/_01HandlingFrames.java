package com.BasicCommands.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01HandlingFrames {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
		_01HandlingFrames hf = new _01HandlingFrames();
		// FInd the element using index
		hf.switchToFrame(0);
		driver.findElement(By.xpath("//a[text()='java.io']")).click();
		Thread.sleep(3000);

		// FInd the element using name of the frame
		hf.switchToFrame("packageFrame");
		driver.findElement(By.linkText("AbstractListModel")).click();
		Thread.sleep(3000);

		// FInd the element using WebElement
		WebElement frameElement = driver.findElement(By.name("classFrame"));
		hf.switchToFrame(frameElement);
		driver.findElement(By.linkText("java.net")).click();
		Thread.sleep(3000);
	}
	// Below is the code snippet to work with switchToFrame using frame id.
	public void switchToFrame(int frameNo) {
		try {
			driver.switchTo().frame(frameNo);
			System.out.println("The control is currently in Frame : " + frameNo);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with id " + frameNo + e.getStackTrace());
		}
	}
	// Below is the example code snippet using frame name.
	public void switchToFrame(String frameName) {
		try {
			driver.switchTo().frame(frameName);
			System.out.println("The control is currently in Frame : " + frameName);
		} catch (NoSuchFrameException e) {
			System.out.println("The frame " + frameName + " Could not be found" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("No Such frame found " + frameName + e.getStackTrace());
		}
	}

	// Below is the example code to send an Element to the and switch.
	public void switchToFrame(WebElement frameElement) {
		try {
			driver.switchTo().frame(frameElement);
			System.out.println("The control is currently in Frame : " + frameElement);

		} catch (NoSuchFrameException e) {
			System.out.println("The frame " + frameElement + "Could not be found" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("No Such frame found " + frameElement + e.getStackTrace());
		}
	}
	// Some times when there are multiple Frames (Frame in side a frame),
	// we need to first switch to the parent frame and then we need to switch to the child frame.
	// Below is the code snippet to work with multiple frames.

	public void switchToFrame(String ParentFrame, String ChildFrame) {
		try {
			driver.switchTo().frame(ParentFrame).switchTo().frame(ChildFrame);
			System.out.println("Navigated to innerframe with id " + ChildFrame + "which is present on frame with id"
					+ ParentFrame);
		} catch (NoSuchFrameException e) {
			System.out
					.println("Unable to locate frame with id " + ParentFrame + " or " + ChildFrame + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to innerframe with id " + ChildFrame
					+ "which is present on frame with id" + ParentFrame + e.getStackTrace());
		}
	}
	// After working with the frames, main important is to come back to the web page. 
	//if we don't switch back to the default page, driver will throw an exception.
	// Below is the code snippet to switch back to the default content.
	public void switchtoDefaultFrame() {
		try {
			driver.switchTo().defaultContent();
			//or
			driver.switchTo().parentFrame();
			System.out.println("Navigated back to webpage from frame");
		} catch (Exception e) {
			System.out.println("unable to navigate back to main webpage from frame" + e.getStackTrace());
		}
	}
}
