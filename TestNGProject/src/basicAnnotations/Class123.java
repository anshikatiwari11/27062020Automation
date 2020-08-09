package basicAnnotations;

import org.testng.annotations.Test;

public class Class123 {
	@Test
	public void spt()
	{
		System.out.println("You are in spt");
	}
	
	@Test(priority = 0)
	public void sst()
	{
		System.out.println("You are in sst");
	}
	
	@Test(priority = -24)
	public void trd()
	{
		System.out.println("You are in trd");
	}

}
