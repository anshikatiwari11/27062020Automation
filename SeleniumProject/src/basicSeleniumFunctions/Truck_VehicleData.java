package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Truck_VehicleData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		WebElement ele2=dr.findElement(By.id("nav_truck"));
		String data = ele2.getText();
		System.out.println(data);
		ele2.click();
		
		dr.findElement(By.id("engineperformance")).sendKeys("165");
		dr.findElement(By.id("payload")).sendKeys("505");
		dr.findElement(By.id("totalweight")).sendKeys("123");
		dr.findElement(By.id("listprice")).sendKeys("1234");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("1234");
		dr.findElement(By.id("annualmileage")).sendKeys("1234");

	}

}
