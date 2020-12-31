package com.TextVerify.FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageObjects.UI.Chapter1_PageObjects;
import com.PageObjects.UI.Home_PageObjects;

public class TestClass {
	
	WebDriver driver;

	@BeforeTest
    public void doBeforeTest() 
	{
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String chromeDriverPath2 = System.getProperty("user.dir") + "\\chromedriver.exe";
		System.out.println(chromeDriverPath2);
		System.setProperty("webdriver.chrome.driver", chromeDriverPath2);
		driver = new ChromeDriver();
    }
	
	@Test
	public void sum() 
	{
		  driver.get("http://book.theautomatedtester.co.uk/");
		  driver.manage().window().maximize();
		  Home_PageObjects HomePage = new Home_PageObjects(driver); 
		  HomePage.ClickOn_Chapter1();
		  
		  Chapter1_PageObjects Ch_HomePage = new Chapter1_PageObjects(driver); 
		  String Text = Ch_HomePage.GetText();
		  Assert.assertEquals(Text, "Assert that this text is on the page");
		  driver.navigate().back();	  
	}
	@AfterTest
    public void doAfterTest() 
	{
		driver.quit();
    }
}
