package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywod_enable
{
	@Test(timeOut = 1000)
	public void m1() throws InterruptedException
	{
		Reporter.log("M1 is running",true);
		Thread.sleep(11000);
	}
	
	@Test()
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
	
	@Test(priority =-4,enabled = false)
	public void m3()
	{
		Reporter.log("M3 is running",true);
	}
	
	@Test(priority = 1)
	public void m4()
	{
		Reporter.log("M4 is running",true);
	}
	
	
}
