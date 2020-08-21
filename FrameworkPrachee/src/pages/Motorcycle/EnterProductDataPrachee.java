package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibraryPrachee;

public class EnterProductDataPrachee {

	WebDriver dr;
	CommonLibraryPrachee lib = new CommonLibraryPrachee();
	
	By enterProductData = By.xpath("//a[@id='enterproductdata']");
	
	public EnterProductDataPrachee(WebDriver dr) {
		this.dr = dr;
	}

	public void navigateToEnterProductData() {
		dr.findElement(enterProductData).click();
	}

	By navigator = By.xpath("//span[contains(text(),'Motor')]");
	By startDateTextBox = By.xpath("//input[@id='startdate']");
	By startDateLabel = By.xpath("//label[text()='Start Date']");
	By startDateCalendar = By.xpath("//button[@id='openstartdatecalender']");
	By startDateCalPrev = By.xpath("//a[@title='Prev']");
	By startDateSelectable = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='15']");
	
	By insuranceSumLabel = By.xpath("//label[text()='Insurance Sum [$]']");
	By insuranceSumDropDown = By.xpath("//select[@id='insurancesum']");
	
	By damageInsuranceLabel = By.xpath("//label[text()='Damage Insurance']");
	By damageInsuranceDropDown = By.xpath("//select[@id='damageinsurance']");
	
	By optionalProductLabel = By.xpath("//label[text()='Optional Products']");
	By optionalProductsTextBox = By.xpath("//label[text()='Optional Products']/following-sibling::p/label/span");
	
	By prevButton = By.xpath("//button[@id='preventerinsurancedata']");
	By nextButton = By.xpath("//button[@id='nextselectpriceoption']");
	
	public boolean verifyStartLabelVisibility() {
		return lib.isElementPresent(dr, startDateLabel);
	}

	public boolean verifyStartDateTextBoxVisible() {
		return lib.isElementPresent(dr, startDateTextBox);
	}
	
	public boolean verifyCalendarClickable() {
		dr.findElement(startDateCalendar).click();
		return lib.isElementPresent(dr, startDateSelectable);
	}

	
	public boolean validateStartDate() {
		dr.findElement(startDateTextBox).sendKeys("10/10/2020");
		String startDateLabelText = dr.findElement(startDateLabel).getText();
		String path = lib.validationXpath(startDateLabelText);
		return lib.verifyValidSelections(dr, path);
	}
	
	public String verifyNextLabelText() {
		String labelText = dr.findElement(startDateLabel).getText();
		return lib.returnNextLabelText(dr, labelText);
	}

	public boolean verifyInsuranceSumLabelVisibility() {
		return lib.isElementPresent(dr, insuranceSumLabel); 
	}

	public boolean verifyInsuranceSumDropDownVisibility() {
		return lib.isElementPresent(dr, insuranceSumDropDown);
	}

	public boolean validateInsuranceSumSelection() {
		dr.findElement(By.xpath("(//select[@id='insurancesum']/option)[2]")).click();
		String insuranceSumLabelText = dr.findElement(insuranceSumLabel).getText();
		String path = lib.validationXpath(insuranceSumLabelText);
		return lib.verifyValidSelections(dr, path ); 
	}

	public boolean verifyDamageInsuranceLabelVisibility() {
		return lib.isElementPresent(dr, damageInsuranceLabel);
				
	}

	public boolean verifyDamageInsuranceDropDownVisibility() {
		return lib.isElementPresent(dr, damageInsuranceDropDown);
	}

	public boolean validateDamageInsuranceDropDownSelection() {
		dr.findElement(By.xpath("(//select[@id='damageinsurance']/option)[3]")).click();
		String damageInsuranceLabelText = dr.findElement(damageInsuranceLabel).getText();
		String path = lib.validationXpath(damageInsuranceLabelText);
		return lib.verifyValidSelections(dr, path);
	}

	public Object verifyOptionalProductLabelVisibility() {
		return lib.isElementPresent(dr, optionalProductLabel);
	}

	public boolean verifyOptionalProductTextBoxVisibility() {
		return lib.isElementPresent(dr, optionalProductsTextBox);
	}

	public boolean validateOptionalProductCheckBoxSelection() {
		dr.findElement(By.xpath("(//label[text()='Optional Products']/../p/label/span)[2]")).click();
		String optionalProductLabelText = dr.findElement(optionalProductLabel).getText();
		String path = lib.validationXpath(optionalProductLabelText);
		return lib.verifyValidSelections(dr, path);
	}

	public boolean verifyPrevButtonVisibility() {
		return lib.isElementPresent(dr, prevButton);
	}

	public boolean verifyNextButtonVisibility() {
		return lib.isElementPresent(dr, nextButton);
	}

	public boolean verifyPrevButtonText() {
		String prevButtonText = dr.findElement(prevButton).getText();
		return prevButtonText.equals("« Prev");
	}

	public boolean verifyNextButtonText() {
		String nextButtonText = dr.findElement(nextButton).getText();
		return nextButtonText.equals("Next »");
	}

	public void ClickPrev() {
		dr.findElement(prevButton).click();
	}

	

}
