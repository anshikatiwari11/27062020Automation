package testScripts.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;
import libraries.CommonLibrary;

public class SelectPriceOption extends PreconditionMotorcycle {
	
	
	CommonLibrary lib = new CommonLibrary();
	
	@BeforeClass
	public void beforeProductData() {
		selectpriceoption = new pages.Motorcycle.SelectPriceOption(dr);
		
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
	}
		
	@Test(priority=0)
	public void verifyIsSelectpriceoptionVisible() 
	{
		
		Assert.assertEquals(selectpriceoption.isPriceperyearDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isOnlineclaimDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isClaimsdiscountDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isWorldwidecoverDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectoptionDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectoptionErrorDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSilverDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isGoldDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isPlatinumDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isUltimateDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectsilverDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectgoldDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectplatinumDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isSelectultimateDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isViewquoteDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isDownloadquoteDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isNextbuttonDisplayed(), true);
		Assert.assertEquals(selectpriceoption.isPreviousbuttonDisplayed(), true);
	}
	
	@Test(priority=1)
	public void verifyIsSelectpriceoptiontext()
	{		
		Assert.assertEquals(selectpriceoption.getPriceperyearText(),"Price per Year ($)");
		Assert.assertEquals(selectpriceoption.getOnlineclaimText(),"Online Claim");
		Assert.assertEquals(selectpriceoption.getClaimsdiscountText(),"Claims Discount (%)");
		Assert.assertEquals(selectpriceoption.getWorldwidecoverText(),"Worldwide Cover");
		Assert.assertEquals(selectpriceoption.getSelectoptionText(),"Select Option");
		Assert.assertEquals(selectpriceoption.getSilverText(),"Silver");
		Assert.assertEquals(selectpriceoption.getGoldText(),"Gold");
		Assert.assertEquals(selectpriceoption.getPlatinumText(),"Platinum");
		Assert.assertEquals(selectpriceoption.getUltimateText(),"Ultimate");
	}
	

	@Test(priority=2)
	public void verifyIsSelectpriceoptionClickable()
	{
		selectpriceoption.clickSelectsilver();
		selectpriceoption.clickSelectgold();
		selectpriceoption.clickSelectplatinum();
		selectpriceoption.clickSelectultimate();
	}
	@Test(priority=3)
	public void verifyIsSelectpriceoption1text()
	{
		Assert.assertEquals(selectpriceoption.getViewquoteText(),"VIEW QUOTE");
		Assert.assertEquals(selectpriceoption.getDownloadquoteText(),"DOWNLOAD QUOTE");
		Assert.assertEquals(selectpriceoption.getNextbuttonText(),"Next »");
		Assert.assertEquals(selectpriceoption.getPreviousbuttonText(),"« Prev");
	}
	@Test(priority=4)
	public void verifyIsSelectpriceoption1Clickable()
	{
		selectpriceoption.clickNextbutton();
	}

}
