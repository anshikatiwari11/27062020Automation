package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import libraries.CommonLibraryPrachee;

public class EnterInsuranceDataPrachee {

	WebDriver dr;
	CommonLibraryPrachee lib= new CommonLibraryPrachee();
	
	public EnterInsuranceDataPrachee(WebDriver dr)
	{
		this.dr=dr;			
	}
	
	By make=By.id("make");
	By enginePerformance=By.id("engineperformance");
	
	public boolean isMakeDropdownDisplayed()
	{
		return lib.isElementPresent(dr, make);
	}
	
	public boolean isEnginePerformanceTextboxDisplayed()
	{
		return lib.isElementPresent(dr, enginePerformance);		
	}
	
	public void selectMaker(String visibleText)
	{
		//Verify element is present
		Assert.assertEquals(true, lib.isElementPresent(dr, make));
		
		//Select value	
		lib.selectByVisibleText(dr, make, visibleText);
	}
	
	public void enterEnginePerformace(String enginePerformaceinKW)
	{
		dr.findElement(enginePerformance).sendKeys(enginePerformaceinKW);
	}
	
}
