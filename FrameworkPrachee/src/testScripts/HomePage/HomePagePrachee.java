package testScripts.HomePage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.DriverPrachee;
import pages.Automobile.EnterInsuranceDataPrachee;

public class HomePagePrachee extends DriverPrachee{
	
	WebDriver dr;
	pages.HomePagePrachee homePage;
	EnterInsuranceDataPrachee automobileEnterInsuranceData;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		dr=lib.launchBrowser(browser);
		homePage=new pages.HomePagePrachee(dr);
		automobileEnterInsuranceData= new EnterInsuranceDataPrachee(dr);
	}
	
	@AfterTest
	public void quitBrower()
	{
		dr.quit();
	}
	
	@Test
	public void verifyIsAutomobileVisible()
	{
		Assert.assertEquals(homePage.isAutomobileDisplayed(), true);
	}
	
	@Test
	public void verifyIsTruckVisible()
	{
		Assert.assertEquals(homePage.isTruckDisplayed(), true);
	}
	
	@Test
	public void verifyIsMotorCycleVisible()
	{
		Assert.assertEquals(homePage.isMotorcycleDisplayed(), true);
	}
	
	@Test
	public void verifyIsCamperVisible()
	{
		Assert.assertEquals(homePage.isCamperDisplayed(), true);
	}
	
	@Test(priority=1)
	public void verifyIsAutobileClickable()
	{
		homePage.clickAutomobile();		
		Assert.assertEquals(automobileEnterInsuranceData.isMakeDropdownDisplayed(), true);
	}
	
	@Test(priority=2)
	public void verifyIsTruckClickable()
	{
		lib.navigateTohomePage(dr);
		
		homePage.clickTruck();
		
		//Put Validation -- Need to add elements in enterInsuranceData class under Truck
	}

}
