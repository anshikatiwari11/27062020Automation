package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException {
		test();
		test2();
		test3();
		test4();
	}
	public static void test() throws FileNotFoundException //To declare checked exception.
	{
		FileInputStream file= new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.Properties");
	}
	public static void test2()
	{
		try {
			FileInputStream file= new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.Properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void test3() throws ArithmeticException
	{
	}	
	public static void test4() throws IOException
	{
	}	

}
