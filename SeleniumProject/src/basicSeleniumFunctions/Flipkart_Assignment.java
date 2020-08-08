package basicSeleniumFunctions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Assignment {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			
			dr.get("https://www.flipkart.com/");
			dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
								
			Actions act= new Actions(dr);
			act.moveToElement(dr.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"))).build().perform();
			
			WebDriverWait wait = new WebDriverWait(dr,10);
		    wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[@title='Laptops']"))));
			
			dr.findElement(By.xpath("//a[@title='Laptops']")).click();
			wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
		    act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")),50,0).build().perform();
		    
		   	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title='Dell']//div[@class='_1p7h2j']")));
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)dr;
			jse.executeScript("window.scrollBy(0,250)", "");
			dr.findElement(By.xpath("//div[@title='Dell']//div[@class='_1p7h2j']")).click();
			Thread.sleep(5000);
		    dr.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();

		     Thread.sleep(5000);
		     List<WebElement> element =  dr.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));

		      element.get(0).click();
		      
		      Set<String> wins=dr.getWindowHandles();
			  for(String w:wins)
				{
					dr.switchTo().window(w);
					
					List<WebElement> elements = dr.findElements(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
														
				}
		      
			
		  
			
			//Electronic Button
			//dr.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).click();
			
			

	}

}
