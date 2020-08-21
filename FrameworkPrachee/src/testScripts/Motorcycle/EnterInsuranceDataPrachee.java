package testScripts.Motorcycle;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EnterInsuranceDataPrachee extends PreconditionMotorcyclePrachee {

	/*
	 * public WebDriver dr;
	 * 
	 * @BeforeTest
	 * 
	 * @Parameters("browser") public void launchBrowser(String browser) { dr =
	 * lib.launchBrowser(browser); motorEnterInsuranceData = new
	 * pages.Motorcycle.EnterInsuranceData(dr); motorEnterVehicleData = new
	 * pages.Motorcycle.EnterVehicleData(dr); motorEnterProductData = new
	 * pages.Motorcycle.EnterProductData(dr); homePage.clickMotorcycle(); //
	 * dr.findElement(motorcycle).click(); }
	 */

	@BeforeClass
	public void navigateToEnterInsuranceData() {
		motorEnterInsuranceData.navigateToEnterInsuranceData();
	}

	@Test
	public void isHobbiesLabelVisible() {

		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesLabelVisibility(), true);
	}

	@Test
	public void isHobbiesCheckBoxVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesCheckBoxVisibility(), true);
	}
	
	@Test(dataProvider="hobbiesOptions")
	public void hobbiesOptionsVisible(String hobbiesOption) {
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesOptions(hobbiesOption), true);
	}

	@Test
	public void validHobbiesSelection() {
		Assert.assertEquals(motorEnterInsuranceData.validHobbiesSelection(), true);
	}

	@Test
	public void isWebsiteLabelVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyWebsiteLabel(), true);
	}

	@Test
	public void isWebsiteTextBoxVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyWebsiteTextBoxVisibility(), true);
	}

	@Test(dataProvider = "validWebsiteTestData")
	public void validWebsiteEntry(String validWebsite) {
		Assert.assertEquals(motorEnterInsuranceData.validWebsiteEntry(validWebsite), true);
	}

	@Test(dataProvider = "invalidWebsiteTestData")
	public void invalidWebsitentry(String invalidWebsite) {
		Assert.assertEquals(motorEnterInsuranceData.invalidWebsiteEntry(invalidWebsite), false);
	}

	@Test
	public void isPictureLabelVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPictureLabelVisibility(), true);
	}
	
/*	@Test
	public void selectPicture() throws InterruptedException, AWTException {
		Assert.assertEquals(motorEnterInsuranceData.validPictureSelection(), true);
	}*/

	@Test
	public void isPrevButtonVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPrevButtonVisibility(), true);
	}

	@Test
	public void verifyPrevButtonText() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPrevButtonText(), true);
	}

	@Test
	public void verifyOnClickPrevButton() {
		motorEnterInsuranceData.ClickPrev();
		Assert.assertEquals(motorEnterVehicleData.isCylinderCapacityVisible(), true);
		motorEnterInsuranceData.navigateToEnterInsuranceData();
	}

	@Test
	public void isNextButtonVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyNextButtonVisibility(), true);
	}

	@Test
	public void verifyNextButtonText() {
		Assert.assertEquals(motorEnterInsuranceData.verifyNextButtonText(), true);
	}
	
	@Test(priority = 1)
	public void verifyOnClickNextButton() {
		motorEnterInsuranceData.ClickNext();
		boolean result;
		boolean navigatorStatus = motorEnterInsuranceData.verifyOnClickNextButton();
		boolean nextPageElementStatus = motorEnterProductData.verifyStartLabelVisibility();
		result = navigatorStatus && nextPageElementStatus;
		Assert.assertEquals(result, true);
	}

	@DataProvider
	public String[] validWebsiteTestData() throws IOException {
		String data[] = new String[3];
		for (int i = 1; i <= 3; i++) {
			data[i - 1] = xl.getCellData("Test", i, 0);
		}
		return data;
	}

	@DataProvider
	public String[] invalidWebsiteTestData() throws IOException {
		String data[] = new String[4];
		int j = 0;
		for (int i = 5; i <= 8; i++) {
			data[j] = xl.getCellData("Test", i, 0);
			j++;
		}
		return data;
	}
	
	@DataProvider
	public String[] hobbiesOptions() throws IOException {
		String hobbiesOptions[]=new String[5];
		int j=0;
		for(int i=10;i<15;i++) {
			hobbiesOptions[j]=xl.getCellData("Test", i, 0);
			j++;
		}
		return hobbiesOptions;
		
	}
}
