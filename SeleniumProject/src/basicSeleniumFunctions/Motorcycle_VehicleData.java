package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Motorcycle_VehicleData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		dr.findElement(By.id("nav_motorcycle")).click();
		
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		Select sel= new Select(makeDropDown);
		sel.selectByIndex(3);
		
		WebElement makeDropDown1=dr.findElement(By.name("Model"));
		Select sel1= new Select(makeDropDown1);
		sel1.selectByIndex(2);		
		
		dr.findElement(By.id("cylindercapacity")).sendKeys("165");
		
		dr.findElement(By.id("engineperformance")).sendKeys("505");
		
		 dr.findElement(By.id("dateofmanufacture")).sendKeys("10/31/2012");
			
		WebElement makeDropDown2=dr.findElement(By.name("Number of Seats"));
		Select sel2= new Select(makeDropDown2);
		sel2.selectByIndex(1);
			
		dr.findElement(By.id("listprice")).sendKeys("123");
		dr.findElement(By.id("annualmileage")).sendKeys("1234");
		
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
        dr.findElement(By.id("firstname")).sendKeys("ABC");
		
		dr.findElement(By.id("lastname")).sendKeys("DEF");
		
		dr.findElement(By.id("birthdate")).sendKeys("10/11/2000");
		
		dr.findElement(By.className("ideal-radiocheck-label")).click();
		
		dr.findElement(By.id("streetaddress")).sendKeys("ABCDEF");
		
		WebElement makeDropDown4=dr.findElement(By.name("Country"));
		Select sel4= new Select(makeDropDown4);
		sel4.selectByIndex(1);
		
		dr.findElement(By.id("zipcode")).sendKeys("123345");
		
		dr.findElement(By.id("city")).sendKeys("PQR");
		
		WebElement makeDropDown5=dr.findElement(By.name("Occupation"));
		Select sel5= new Select(makeDropDown5);
		sel5.selectByIndex(1);
		
		dr.findElement(By.className("ideal-check")).click();
		
		dr.findElement(By.id("website")).sendKeys("https://www.google.co.in/");
		
		//dr.findElement(By.className("ideal-file-upload")).sendKeys("D:\\Images\\download1.jpg");
		
		dr.findElement(By.id("nextenterproductdata")).click();
		
        dr.findElement(By.id("startdate")).sendKeys("10/31/2020");
        
        WebElement makeDropDown6=dr.findElement(By.name("Insurance Sum"));
		Select sel6= new Select(makeDropDown6);
		sel6.selectByIndex(2);
		
		WebElement makeDropDown8=dr.findElement(By.id("damageinsurance"));
		Select sel8= new Select(makeDropDown8);
		sel8.selectByIndex(1);
		
		dr.findElement(By.className("ideal-radiocheck-label")).click();
		
		dr.findElement(By.id("nextselectpriceoption")).click();

	}

}
