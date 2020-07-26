package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile_EnterVehical_Data {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		String data = ele.getText();
		System.out.println(data);
		ele.click();
		
		WebElement makeDropDown=dr.findElement(By.name("Make"));
		Select sel= new Select(makeDropDown);
		sel.selectByIndex(4);
				
		dr.findElement(By.id("engineperformance")).sendKeys("165");
		
		dr.findElement(By.id("dateofmanufacture")).sendKeys("10/31/2012");
		
		WebElement makeDropDown2=dr.findElement(By.name("Number of Seats"));
		Select sel2= new Select(makeDropDown2);
		sel2.selectByIndex(1);
		
		WebElement makeDropDown3=dr.findElement(By.name("Fuel Type"));
		Select sel3= new Select(makeDropDown3);
		sel3.selectByIndex(1);
		
		dr.findElement(By.id("listprice")).sendKeys("505");
		
		dr.findElement(By.id("licenseplatenumber")).sendKeys("ABCD");
		
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
		
		//dr.findElement(By.className("Hobbies")).click();
		
		dr.findElement(By.id("website")).sendKeys("https://www.google.co.in/");
		//dr.findElement(By.id("picture")).sendKeys("");

			
		}

}
