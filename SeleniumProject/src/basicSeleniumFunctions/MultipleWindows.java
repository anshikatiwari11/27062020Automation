package basicSeleniumFunctions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		String parent=dr.getWindowHandle();
		System.out.println(parent);
		
		//1.Search VW on home page.
		dr.findElement(By.id("search_form")).sendKeys("abc");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		Thread.sleep(10000);
		
		dr.findElement(By.id("search_form")).sendKeys("VM");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		Thread.sleep(10000);
		
		dr.findElement(By.id("search_form")).sendKeys("xyz");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		Thread.sleep(10000);
		
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		
		//2.Switch to child window. (WAY=1)
		//Set<String> wins=dr.getWindowHandles();
		/*for(String w:wins)
		{
			if (!w.equals(parent))
			{
				dr.switchTo().window(w);
			}
		}*/
		
		//WAY2= Switch to child window by search title for multiple child windows.
		/*for(String w:wins)
		{
			dr.switchTo().window(w);
			//Fetch title
			String title=dr.getTitle();
			if(title.equals("Search Results"))
			{
				break;
			}
		}*/
		
		//WAY3= By finding unique elements in child windows.
		Set<String> wins=dr.getWindowHandles();
		for(String w:wins)
		{
			dr.switchTo().window(w);
			
			List<WebElement> elements =  dr.findElements(By.xpath("//input[@value='BMW']"));
			
			if(elements.size()>0)
			{
				break;
			}
			
		}
				
		//3.Click on Login/Register link
		dr.findElement(By.xpath("//a[text()='Login/Register']")).click();
		
		//4.Enter username on pop-up windows.
		dr.findElement(By.id("user_name")).sendKeys("anshika@gmail.com");
		
		//5.Close child window
		dr.close();
		
		//6.Switch back to parent window
		dr.switchTo().window(parent);
		
		//7.Click on Automobile Link
		dr.findElement(By.id("nav_automobile")).click();
	}
}
	
