package testScripts.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driver.Driver;
import libraries.CommonLibrary;


public class PreconditionMotorcycle extends Driver {
	protected static WebDriver dr;
	pages.HomePage homePage;
	pages.Motorcycle.EnterInsuranceData enterInsuranceData;
	pages.Motorcycle.EnterVehicleData enterVehicleData;
	pages.Motorcycle.EnterProductData enterProductData;
	pages.Motorcycle.SelectPriceOption selectpriceoption;
	pages.Motorcycle.SendQuote sendquote;
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws InterruptedException
	{
		
		dr=lib.launchBrowser(browser);
		homePage=new pages.HomePage(dr);
		//enterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
		//enterVehicleData = new pages.Motorcycle.EnterVehicleData(dr);
		//enterProductData = new pages.Motorcycle.EnterProductData(dr);
		selectpriceoption = new pages.Motorcycle.SelectPriceOption(dr);
		sendquote = new pages.Motorcycle.SendQuote(dr);
		//homePage.clickMotorcycle();

		
	}
	
	
	@AfterTest
	public void quitBrower()
	{
		dr.quit();
	}
}
