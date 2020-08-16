package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {

	@Test
	public void test1() {
		System.out.println("Testing Maven-TestNG Integration");
	}

	@Test
	public void test2() throws InterruptedException {
		// Launch browser
		// Click automobile
		// 1 more step
		System.setProperty("webdriver.chrome.driver",
				"D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://paytm.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(5000);
		dr.switchTo().frame(0);
		//dr.switchTo().frame(dr.findElement(By.tagName("");
		System.out.println(dr.findElement(By.xpath("//p[text()='To Login into your Paytm Web account']")).getText());
	}

}
