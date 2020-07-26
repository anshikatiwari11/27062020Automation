package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Motorcycle_VehicleData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		dr.findElement(By.id("nav_motorcycle")).click();
		
		
		dr.findElement(By.id("cylindercapacity")).sendKeys("165");
		dr.findElement(By.id("engineperformance")).sendKeys("505");
		dr.findElement(By.id("listprice")).sendKeys("123");
		dr.findElement(By.id("annualmileage")).sendKeys("1234");

	}

}
