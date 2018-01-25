package com.companyname.projectname.PageObject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
 
	public Logger log = Logger.getLogger("devpinoyLogger");
	
	WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePage openApplication(){
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver=null;
		driver.manage().window().maximize();
		driver.get("www.makemytrip.com");
		//driver.navigate().to("http://www.makemytrip.com/");
		log.debug("Application opened");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("header_tab_flights")));
		return new HomePage(driver);
		
	}
}
