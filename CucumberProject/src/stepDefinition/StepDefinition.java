package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver dr;

	@Given("^user is on home page$")
	public void navigateToTricentis() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Techbodhi\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/index.php");
	}

	@When("^user search with (.*?) keyword$")
	public void enterSearchData(String searchData) {
		dr.findElement(By.id("search_form")).clear();
		dr.findElement(By.id("search_form")).sendKeys(searchData);
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
	}

	@Then("^relevant results should displayed$")
	public void validateSearchResults() {
		Set<String> wins = dr.getWindowHandles();
		if (wins.size() > 1) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
		}
		dr.quit();
	}

	@When("^user scroll till end of page$")
	public void scrollTillPageEnd() {
		WebElement ele = dr.findElement(By.id("tricentis_about"));

		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	@Then("^footer links should displayed$")
	public void verifyFooters() {
		dr.findElement(By.id("tricentis_resources")).click();
	}

	@When("^click on Automobile link$")
	public void clickAutomobileLink() {
		dr.findElement(By.id("nav_automobile")).click();
	}

	@And("^click on Enter Insurance Data link$")
	public void clickEnterInsuranceData() {
		dr.findElement(By.id("enterinsurantdata")).click();
	}

	@And("^click on open button and upload document$")
	public void clickOpenButtonAndUploadDocument() throws AWTException, InterruptedException {
		
		String document="D:\\Images\\download1.jpg";
		dr.findElement(By.id("open")).click();
		Thread.sleep(3000);
		//Copy data in clipboard
		StringSelection cb = new StringSelection(document);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb,null);
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			
		
	}

	@Then("^document should be uploaded$")
	public void verifyDocumentUploaded() {
		System.out.println("Document uploaded");
	}
}