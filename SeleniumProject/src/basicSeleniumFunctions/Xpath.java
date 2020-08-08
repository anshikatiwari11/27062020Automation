package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//Click and get text
		WebElement ele=dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		//This Xpath can also be used //li[@class="menu-item"]/a[@id='nav_automobile']
		String data = ele.getText();
		System.out.println(data);
		ele.click();
		
		WebElement makeDropDown=dr.findElement(By.xpath("//select[@id='make']"));
		Select sel= new Select(makeDropDown);
		sel.selectByIndex(4);
		//Xpath with two elements(AttributeNames).		
		dr.findElement(By.xpath("//input[@id='engineperformance'][@name=\"[kW]\"]")).sendKeys("165");
		
		dr.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("10/31/2012");
		
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
		
		dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("ABC");
		
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("DEF");
		
		dr.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("10/11/2000");
		
		//Click on checkbox
		WebElement check=dr.findElement(By.xpath("//label[contains(.,'Bungee')]/span"));
		boolean isSelected=check.isSelected();
		System.out.println(isSelected);
		
		check.click();
		isSelected=check.isSelected();
		System.out.println(isSelected);
		
		
	}

}
