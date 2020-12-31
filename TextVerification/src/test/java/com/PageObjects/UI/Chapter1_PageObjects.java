package com.PageObjects.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Chapter1_PageObjects {
	public WebDriver driver;
	By Text = By.id("divontheleft");

	public Chapter1_PageObjects(WebDriver driver) 
	{
	        this.driver= driver;
    }

    public String GetText() 
    {
    	return driver.findElement(Text).getText();
    }
    
}
