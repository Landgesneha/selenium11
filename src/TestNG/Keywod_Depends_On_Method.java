package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywod_Depends_On_Method
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
	
	@Test(timeOut = 1000)
	public void m3() throws InterruptedException
	{
		Reporter.log("M3 is running",true);
		//Thread.sleep(10000);
	}
	
	@Test(dependsOnMethods = {"m1","m3"})
	public void m4()
	{
		Reporter.log("m4 is running",true);
	}
}
