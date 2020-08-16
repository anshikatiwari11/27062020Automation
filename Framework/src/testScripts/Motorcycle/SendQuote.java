package testScripts.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;

public class SendQuote extends Driver{
	WebDriver dr;
	pages.Motorcycle.SendQuote sendquote;
		
	/*
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws InterruptedException
	{
		dr=lib.launchBrowser(browser);
		WebElement ele=dr.findElement(By.xpath("//a[@id='nav_motorcycle']"));
		String data = ele.getText();
		ele.click();
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		Select sel= new Select(makeDropDown);
		sel.selectByIndex(3);
		WebElement makeDropDown1=dr.findElement(By.name("Model"));
		Select sel1= new Select(makeDropDown1);
		sel1.selectByIndex(2);		
		dr.findElement(By.id("cylindercapacity")).sendKeys("165");
		dr.findElement(By.id("engineperformance")).sendKeys("505");
		dr.findElement(By.id("dateofmanufacture")).sendKeys("10/31/2012");
		WebElement makeDropDown2=dr.findElement(By.id("numberofseatsmotorcycle"));
		Select sel2= new Select(makeDropDown2);
		sel2.selectByIndex(2);
		dr.findElement(By.id("listprice")).sendKeys("523");
		dr.findElement(By.id("annualmileage")).sendKeys("1234");
		dr.findElement(By.id("nextenterinsurantdata")).click();
		dr.findElement(By.id("firstname")).sendKeys("ABC");
		dr.findElement(By.id("lastname")).sendKeys("DEF");
		dr.findElement(By.id("birthdate")).sendKeys("10/11/2000");
		WebElement makeDropDown4=dr.findElement(By.name("Country"));
		Select sel4= new Select(makeDropDown4);
		sel4.selectByIndex(1);
		dr.findElement(By.id("zipcode")).sendKeys("123345");
		WebElement makeDropDown5=dr.findElement(By.name("Occupation"));
		Select sel5= new Select(makeDropDown5);
		sel5.selectByIndex(1);
		WebElement check=dr.findElement(By.xpath("//label[contains(.,'Bungee')]/span"));
		boolean isSelected=check.isSelected();
		check.click();
		isSelected=check.isSelected();
		dr.findElement(By.id("nextenterproductdata")).click();
		dr.findElement(By.id("startdate")).sendKeys("10/31/2020");
        WebElement makeDropDown6=dr.findElement(By.name("Insurance Sum"));
		Select sel6= new Select(makeDropDown6);
		sel6.selectByIndex(2);
		WebElement makeDropDown8=dr.findElement(By.id("damageinsurance"));
		Select sel8= new Select(makeDropDown8);
		sel8.selectByIndex(1);
		WebElement check1=dr.findElement(By.xpath("//label[contains(.,'Euro Protection')]/span"));
		boolean isSelected1=check1.isSelected();
		check1.click();
		isSelected1=check1.isSelected();
		dr.findElement(By.id("nextselectpriceoption")).click();
		
		
		sendquote=new pages.Motorcycle.SendQuote(dr);
		Thread.sleep(10000);
	}
	*/

	@AfterTest
	public void quitBrower()
	{
		dr.quit();
	}
	@Test
	public void verifyIsEmailVisible() 
	{
		Assert.assertEquals(sendquote.isEmailDisplayed(), true);
	}
	@Test
	public void verifyIsPhoneVisible() 
	{
		Assert.assertEquals(sendquote.isPhoneDisplayed(), true);
	}
	@Test
	public void verifyIsUsernameVisible() 
	{
		Assert.assertEquals(sendquote.isUsernameDisplayed(), true);
	}
	@Test
	public void verifyIsPasswordVisible() 
	{
		Assert.assertEquals(sendquote.isPasswordDisplayed(), true);
	}
	@Test
	public void verifyIsConfirmpasswordVisible() 
	{
		Assert.assertEquals(sendquote.isConfirmpasswordDisplayed(), true);
	}
	@Test
	public void verifyIsCommentsVisible() 
	{
		Assert.assertEquals(sendquote.isCommentsDisplayed(), true);
	}
	@Test
	public void verifyIsSendemailVisible() 
	{
		Assert.assertEquals(sendquote.isSendemailDisplayed(), true);
	}
	@Test
	public void verifyIsPrevVisible() 
	{
		Assert.assertEquals(sendquote.isPrevDisplayed(), true);
	}
	@Test
	public void verifyIsMainpageVisible() 
	{
		Assert.assertEquals(sendquote.isMainpageDisplayed(), true);
	}
	@Test
	public void verifyIsNewautomobileinsuranceVisible() 
	{
		Assert.assertEquals(sendquote.isNewautomobileinsuranceDisplayed(), true);
	}
	@Test
	public void verifyIsNewtruckinsuranceVisible() 
	{
		Assert.assertEquals(sendquote.isNewtruckinsuranceDisplayed(), true);
	}
	@Test
	public void verifyIsNewcamperinsuranceVisible() 
	{
		Assert.assertEquals(sendquote.isNewcamperinsuranceDisplayed(), true);
	}
	@Test(priority=0)
	public void enterandVerifySendQuotesPage()
	{
		sendquote.enterEmail("abcd@gmail.com");
		sendquote.enterPhone("1234567890");
		sendquote.enterUsername("Anshika");
		sendquote.enterPassword("Ans1234");
		sendquote.enterComments("Comments Must be under 300 characters.");
				
	}
}
