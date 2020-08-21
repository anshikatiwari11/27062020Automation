package pages.Motorcycle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import libraries.CommonLibraryPrachee;
import pages.Motorcycle.EnterProductDataPrachee;

public class EnterInsuranceDataPrachee {

	WebDriver dr;
	CommonLibraryPrachee lib = new CommonLibraryPrachee();
	EnterProductDataPrachee enterProductData;

	By motorcycle = By.xpath("//a[text()='Motorcycle']");
	By enterInsuranceData = By.xpath("//a[@id='enterinsurantdata']");

	public EnterInsuranceDataPrachee(WebDriver dr) {

		this.dr = dr;
	}

	public void navigateToEnterInsuranceData() {
		dr.findElement(enterInsuranceData).click();
	}

	By navigator = By.xpath("//span[contains(text(),'Motor')]");

	By hobbiesLabel = By.xpath("//label[text()='Hobbies']");
	By hobbiesCheckBox = By.xpath("//label[text()='Hobbies']/../p");

	By websiteLabel = By.xpath("//label[text()='Website']");
	By websiteTextBox = By.xpath("//label[text()='Website']/../input");

	By pictureLabel = By.xpath("//label[text()='Picture']");
	By pictureOpenButton = By.xpath("//button[text()='Open']");
	By pictureTextBox = By.xpath("//input[@id='picture']");

	By prevButton = By.xpath("//button[@id='preventervehicledata']");
	By nextButton = By.xpath("//button[@id='nextenterproductdata']");

	public boolean verifyHobbiesLabelVisibility() {
		return lib.isElementPresent(dr, hobbiesLabel);
	}

	public boolean verifyHobbiesCheckBoxVisibility() {
		return lib.isElementPresent(dr, hobbiesCheckBox);
	}

	public boolean validHobbiesSelection() {
		String hobbies = dr.findElement(hobbiesLabel).getText();
		String path = lib.validationXpath(hobbies);
		dr.findElement(By.xpath("(//label[text()='Hobbies']/../p/label/span)[2]")).click();
		return lib.verifyValidSelections(dr, path);
	}

	public boolean verifyWebsiteLabel() {
		return lib.isElementPresent(dr, websiteLabel);
	}

	public boolean verifyWebsiteTextBoxVisibility() {
		return lib.isElementPresent(dr, websiteTextBox);
	}

	public boolean validWebsiteEntry(String websiteEntry) {
		dr.findElement(websiteTextBox).clear();
		dr.findElement(websiteTextBox).sendKeys(websiteEntry);
		String website = dr.findElement(websiteLabel).getText();
		String path = lib.validationXpath(website);
		return lib.verifyValidSelections(dr, path);
	}

	public boolean invalidWebsiteEntry(String invalidWebsite) {
		dr.findElement(websiteTextBox).clear();
		dr.findElement(websiteTextBox).sendKeys(invalidWebsite);
		String website = dr.findElement(websiteLabel).getText();
		String path = lib.validationXpath(website);
		return lib.verifyValidSelections(dr, path);
	}

	public boolean verifyPictureLabelVisibility() {
		return lib.isElementPresent(dr, pictureLabel);
	}

	public boolean verifyPrevButtonVisibility() {
		return lib.isElementPresent(dr, prevButton);
	}

	public void ClickPrev() {
		dr.findElement(prevButton).click();
	}

	public boolean verifyPrevButtonText() {
		String prevButtonText = dr.findElement(prevButton).getText();
		return prevButtonText.equals("« Prev");
	}

	public boolean verifyNextButtonVisibility() {
		return lib.isElementPresent(dr, nextButton);
	}

	public boolean verifyNextButtonText() {
		String nextButtonText = dr.findElement(nextButton).getText();
		return nextButtonText.equals("Next »");
	}

	public void ClickNext() {
		dr.findElement(nextButton).click();
	}

	public boolean verifyOnClickNextButton() {
		boolean navigatorStatus = lib.isElementPresent(dr, navigator);
		return navigatorStatus;
	}

	public boolean verifyHobbiesOptions(String hobbyText) {
		String elementPath = "//label[text()='"+hobbyText+"']";
		By hobbyOpt = By.xpath(elementPath);
		return lib.isElementPresent(dr, hobbyOpt);
	}

	public boolean validPictureSelection() throws InterruptedException, AWTException {
		dr.findElement(pictureOpenButton).click();
		String imagePath = "D:\\27062020\\27062020Automation\\CucumberProject\\src\\screenshots\\BMW.png";
		Thread.sleep(3000);
		StringSelection cb = new StringSelection(imagePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String imgName = imagePath.split("screenshots\\")[2];
		System.out.println(imgName);
		String viewName = dr.findElement(pictureTextBox).getText();
		return imgName.equals(viewName);
	}

}
