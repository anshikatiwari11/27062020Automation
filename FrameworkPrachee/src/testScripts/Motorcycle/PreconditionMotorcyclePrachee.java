package testScripts.Motorcycle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driver.DriverPrachee;

public class PreconditionMotorcyclePrachee extends DriverPrachee {

	static WebDriver dr;
	pages.Motorcycle.EnterInsuranceDataPrachee motorEnterInsuranceData;
	pages.Motorcycle.EnterVehicleDataPrachee motorEnterVehicleData;
	pages.Motorcycle.EnterProductDataPrachee motorEnterProductData;
	pages.HomePagePrachee homePage;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		dr = lib.launchBrowser(browser);
		homePage=new pages.HomePagePrachee(dr);
		motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceDataPrachee(dr);
		motorEnterVehicleData = new pages.Motorcycle.EnterVehicleDataPrachee(dr);
		motorEnterProductData = new pages.Motorcycle.EnterProductDataPrachee(dr);
		homePage.clickMotorcycle();
	}
	
	@AfterTest
	public void closeBrowser() {
		dr.quit();
	}
}
