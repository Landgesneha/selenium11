package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Homework2 
{
	public class Test1 
	{
		@Test(timeOut=10)
		public void a1() throws InterruptedException
		{
			Reporter.log("M1 is running", true);
			Thread.sleep(10000);
		}

		@Test
		public void a2()
		{   
			Assert.fail();
			Reporter.log("M2 is running", true);
		}
		@Test
		public void a3()
		{   Assert.fail();
			Reporter.log("M3 is running", true);
		}
		@Test
		public void a4()
		{
			Reporter.log("M4 is running", true);
		}
		@Test
		public void a5()
		{
			Reporter.log("M5 is running", true);
		}

		}

}

