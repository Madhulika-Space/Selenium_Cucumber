package com.companyname.projectname.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.companyname.projectname.PageObject.BasePage;
import com.companyname.projectname.PageObject.FlightsPage;
import com.companyname.projectname.PageObject.HomePage;

public class TestCase1 {
		
	BasePage basepage;
	HomePage homepage;
	FlightsPage flightpage;
	
	
	
	
	@BeforeSuite
	public void openHomePage(){
		System.setProperty("webdriver.gecko.driver", "D:\\software\\Selenium_drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		basepage = new BasePage(driver);
		homepage = basepage.openApplication();
	}
	
	@Test(priority=2,dataProvider="getData")
	public void selectTab(String tabName){
		flightpage = (FlightsPage) homepage.selectMenu(tabName);	
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[1][1];
		data[0][0] = "Flights"; 
		return data;
	}
}
