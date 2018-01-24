package com.companyname.projectname.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public BasePage selectMenu(String tabName){
		
		driver.findElement(By.linkText(tabName)).click();
		
		if(tabName.equalsIgnoreCase("flights"))
		{
			return new FlightsPage(driver);
		}
		else if (tabName.equalsIgnoreCase("hotels")){
			return new HotelsPage(driver);
		} else{
			return null;
		}
		
	}

}
