package driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import configuration.ConfigurationPrachee;
import libraries.CommonLibraryPrachee;
import libraries.Xls_ReaderPrachee;

public class DriverPrachee {
	
	public CommonLibraryPrachee lib;
	public Xls_ReaderPrachee xl;
	
	@BeforeSuite
	public void initialize()
	{
		lib= new CommonLibraryPrachee();
		xl= new Xls_ReaderPrachee(ConfigurationPrachee.testDataPath);
		
		//Other project level initializers
	}
	
	@AfterSuite
	public void tearDown()
	{
		//Project level closers
		
	}

}
