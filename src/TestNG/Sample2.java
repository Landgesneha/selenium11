package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 
{
	@BeforeClass
	public void openBrowser()
	{
	Reporter.log("---open Browser---",true);	
	}
	
	@BeforeMethod
	public void logInApp()
	{
		Reporter.log("---pre condition : Un& pass---",true);		
	}
	
	@Test
	public void VerifyPN()
	{
		Reporter.log("---Test is pass---", true);
	}
	
	@AfterMethod
	public void LogOutApp()
	{
		Reporter.log("---Post condition : Log out---", true);
	}
	
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("--Close Browser---", true);
	}
}
