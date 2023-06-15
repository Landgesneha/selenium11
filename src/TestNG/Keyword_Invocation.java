package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Invocation
{
	@Test(invocationCount=10)
	public void m1()
	{
		Reporter.log("M1 is rinning",true);
	}

	@Test
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
}
