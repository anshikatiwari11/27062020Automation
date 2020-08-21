package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import configuration.ConfigurationPrachee;

public class CommonLibraryPrachee {
	
	public WebDriver launchBrowser(String browerName)
	{
		WebDriver dr=null;		
		switch(browerName)
		{
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", ConfigurationPrachee.chromePath);
				dr= new ChromeDriver();
				break;
			case "Firefox":
				//Add gecko driver path for firefox driver
				dr= new FirefoxDriver();
				break;
				
			//Add more cases for other browsers	
		
		}
		dr.manage().window().maximize();
		navigateTohomePage(dr);
		dr.manage().timeouts().implicitlyWait(ConfigurationPrachee.implicitWait, TimeUnit.SECONDS);
		
		return dr;
	}
	
	public void navigateTohomePage(WebDriver dr)
	{
		dr.get(ConfigurationPrachee.url);
	}

	public boolean isElementPresent(WebDriver dr, By element)
	{
		int size=dr.findElements(element).size();
		if(size>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void selectByVisibleText(WebDriver dr, By element, String visibleText)
	{
		Select sel= new Select(dr.findElement(element));
		sel.selectByVisibleText(visibleText);
	}

	public boolean verifyValidSelections(WebDriver dr, String path) {

//		String path = "//label[text()='" + labelText+ "']//parent::div[contains(@class,'valid')]";
//		System.out.println(path);
		int nonSel = dr.findElements(By.xpath(path)).size();
		if (nonSel > 0) {
//			System.out.println("valid selection true");
			return true;
		} else {
//			System.out.println("invalid selection false");
			return false;
		}
	}
	
	public String returnNextLabelText(WebDriver dr, String prevLabelText) {
		String nextLabel= "//label[text()='"+prevLabelText+"']/../following::div/label";
		String nextLabelText = dr.findElement(By.xpath(nextLabel)).getText();
		return nextLabelText;
	}
	
	public String validationXpath(String labelText) {
		String path = "//label[text()='" + labelText+ "']//parent::div[contains(@class,' valid')]";
		return path;
	}
}
