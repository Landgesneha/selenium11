package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Priority
{
	@Test(priority =5)
	public void m1()
	{
		Reporter.log("M1 is running",true);
	}
	
	@Test(priority =1)
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
	
	@Test(priority =4)
	public void m3()
	{
		Reporter.log("M3 is running",true);
	}
	
	@Test(priority = 1)
	public void m4()
	{
		Reporter.log("M4 is running",true);
	}
	
	@Test(priority =3)
	public void m5()
	{
		Reporter.log("M5 is running",true);
	}
	
	@Test(priority =6)
	public void m6()
	{
		Reporter.log("M6 is running",true);
	}
	
	
}
