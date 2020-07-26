package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//Click and get text
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		String data = ele.getText();
		System.out.println(data);
		ele.click();
		
		//Enter Text
		//dr.findElement(By.id("search_form")).sendKeys("VW");
		//dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		
		Select sel= new Select(makeDropDown);
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes Benz");
		
		dr.findElement(By.id("dateofmanufacture")).sendKeys("10/31/2012");
		
		//Radio Button
		dr.findElement(By.className(""));
		
		
	}

}
