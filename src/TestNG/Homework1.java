package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Homework1 
{
	public class Test1 
	{
		@Test(timeOut=10)
		public void m1() throws InterruptedException
		{
			Reporter.log("M1 is running", true);
			Thread.sleep(10000);
		}

		@Test
		public void m2()
		{   
			Assert.fail();
			Reporter.log("M2 is running", true);
		}
		@Test
		public void m3()
		{   Assert.fail();
			Reporter.log("M3 is running", true);
		}
		@Test
		public void m4()
		{
			Reporter.log("M4 is running", true);
		}
		@Test
		public void m5()
		{
			Reporter.log("M5 is running", true);
		}

		}

}
