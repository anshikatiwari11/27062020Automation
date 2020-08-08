package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//Click and get text
		WebElement ele=dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		ele.click();
		
		dr.findElement(By.name("Open Date of Manufacture Calender")).click();
		
		//Select Year 2019
		String year=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		while (!year.equals("2019"))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			year=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		}
		//Select Month January
		String month=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		while (!month.equals("January"))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			month=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		}
		dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='1']")).click();
				
	}
}

     