package testScripts.HomePage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;
import pages.Automobile.EnterInsuranceData;

public class HomePage extends Driver{
	
	WebDriver dr;
	pages.HomePage homePage;
	EnterInsuranceData automobileEnterInsuranceData;
	EnterInsuranceData truckEnterInsuranceData;
	EnterInsuranceData motorcycleEnterInsuranceData;
	EnterInsuranceData camperEnterInsuranceData;
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		dr=lib.launchBrowser(browser);
		homePage=new pages.HomePage(dr);
		automobileEnterInsuranceData= new EnterInsuranceData(dr);
		truckEnterInsuranceData= new EnterInsuranceData(dr);
		motorcycleEnterInsuranceData= new EnterInsuranceData(dr);
		camperEnterInsuranceData= new EnterInsuranceData(dr);
	}
	
	@AfterTest
	public void quitBrower()
	{
		dr.quit();
	}
	
	@Test
	public void verifyIsHomepageVisible()
	{
		Assert.assertEquals(homePage.isAutomobileDisplayed(), true);
		Assert.assertEquals(homePage.isTruckDisplayed(), true);
		Assert.assertEquals(homePage.isMotorcycleDisplayed(), true);
		Assert.assertEquals(homePage.isCamperDisplayed(), true);
	}
		
	@Test(priority=0)
	public void verifyIsAutomobileClickable()
	{
		homePage.clickAutomobile();		
		Assert.assertEquals(automobileEnterInsuranceData.isMakeDropdownDisplayed(), true);
	}
	
	@Test(priority=1)
	public void verifyIsTruckClickable()
	{
		lib.navigateTohomePage(dr);
		
		homePage.clickTruck();
		
		//Put Validation -- Need to add elements in enterInsuranceData class under Truck
	}

}
