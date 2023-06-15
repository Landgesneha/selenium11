package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3
{
@BeforeClass
public void OPenBrowser()
{
	Reporter.log("----OPen Browser---",true);
}
@BeforeMethod
public void loglnApp()
{
	Reporter.log("----Pre Condition: UN & Pass----",true);
}
@Test
public void VerifyPN()
{
	Reporter.log("----Test is pass---",true);
}
@Test
public void AddStockWatchlist()
{
	Reporter.log("Stock is added",true);
}
{
	Reporter.log("");
}

@Test
public void ValidateUserName()
{
	Reporter.log("-------Test Is pass Name is Matching---------",true);
}



@AfterMethod
public void LogOutApp()
{

	Reporter.log("------Post Condition : Log Out-------",true);
	
}

@AfterClass
public void CloseBrowser()
{
	
	Reporter.log("--------Close Browser--------",true);
	
}
}
