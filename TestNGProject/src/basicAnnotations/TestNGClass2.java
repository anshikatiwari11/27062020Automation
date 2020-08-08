package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {
	
	@AfterTest
	public void afterMethod()
	{
		System.out.println("After Module 1");
	}
	@Test
	public void test1()
	{
		System.out.println("Class 2- Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Class 2- Test 2");
	}

}
