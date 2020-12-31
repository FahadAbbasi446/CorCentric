package com.PageObjects.UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Home_PageObjects 
{
	public WebDriver driver;
	By Chapter1 = By.cssSelector("div[class=mainbody] ul li a[href='/chapter1']");

	public Home_PageObjects(WebDriver driver) 
	{
	        this.driver= driver;
    }

    public void ClickOn_Chapter1() 
    {
    	driver.findElement(Chapter1).click();
    }
}
