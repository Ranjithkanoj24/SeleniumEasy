package com.BasicCommands.Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class _07Launch_InternetExplorerBrowser {
	/*//1. If you see issue some thing like '
	Unexpected error launching Internet Explorer' below, You have to set 
	'Enable protected mode' option in all levels with same value. Please follow below steps to set:
	org.openqa.selenium.remote.SessionNotFoundException: Unexpected error launching Internet Explorer. 
	Protected Mode settings are not the same for all zones. Enable Protected Mode must be set to the same value (enabled or disabled)
	 for all zones. (WARNING: The server did not provide any stacktrace information) Command duration or timeout: 516 milliseconds
	*1. Open Internet Explorer browser--> Select Internet Options from Tools menu
	*Select Security Tab --> Select Enable Protected Mode option -- > Check the default Zone level for 'Internet'.
   If you look at the screen shot below, security level for this zone
    is selected as 'Allowed level for this zone : Medium to High.' and 'Enable Protected Mode' option is Checked
	*/
	public WebDriver driver;
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("Launching IE Browser");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyPageTitle(){
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Navigating to FB.com");
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is :"+ pageTitle);
		Assert.assertTrue(pageTitle.contains("Facebook"), "The actual title and the expected title does not match ");
	}
	
	@AfterClass
	public void tearDown(){
		if(driver!=null)
			System.out.println("Browser Closing");
		driver.close();
	}

}
