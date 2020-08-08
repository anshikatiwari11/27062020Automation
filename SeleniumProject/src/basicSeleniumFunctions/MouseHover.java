package basicSeleniumFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.flipkart.com/");
		
		//Implicit Wait
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act= new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
				
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='T-Shirts']"))));
		
		dr.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
	    act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")),50,0).build().perform();
	    
	  //span[text()='Men']//following::a[text()='T-Shirts']
	  //a[text()='T-Shirts']//preceding::span[text()='Men']
	  //a[text()='T-Shirts']//ancestor::li/child::span[text()='Men']
	  //a[text()='T-Shirts']//ancestor::li/span[text()='Men']
	    
	  //span[text()='Men']/../descendant::a[text()='T-Shirts']
	  //span[text()='Men']//parent::li/descendant::a[text()='T-Shirts']
	  //a[text()='Jeans']/..//preceding-sibling::li/a[text()='T-Shirts']
	  //a[text()='T-Shirts']/../following-sibling::li/a[text()='Jeans']
	    
	 }

}


