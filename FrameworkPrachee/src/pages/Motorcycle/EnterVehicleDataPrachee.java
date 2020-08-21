package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibraryPrachee;

public class EnterVehicleDataPrachee {

	CommonLibraryPrachee lib = new CommonLibraryPrachee();
	WebDriver dr;
	
	public EnterVehicleDataPrachee(WebDriver dr)
	{
		this.dr=dr;			
	}
	
	By cyliderCapacityLabel = By.xpath("//label[contains(text(),'Cylinder')]");
	
	public boolean isCylinderCapacityVisible() {
		return lib.isElementPresent(dr, cyliderCapacityLabel);
	}

}
