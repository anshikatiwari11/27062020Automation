package testNgAttributes;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider="getData")
	public void login(String userName, String password, String address)
	{
		System.out.println("Enter Username="+userName);
		System.out.println("Enter Password="+password);
		System.out.println("Click in login button");
		
		System.out.println("*************************");
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][3];
		//Row 1
		data[0][0]="User1";
		data[0][1]="Password1";
		data[0][2]="add1";
		
		//Row 2
		data[1][0]="User2";
		data[1][1]="Password2";
		data[1][2]="add2";
				
		//Row 3
		data[2][0]="User3";
		data[2][1]="Password3";
		data[2][2]="add3";
		
		return data;
	}

}
