package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Verification_Methods
{
	
	
   //1] Assert() Method	
/*@Test
public void test()
{
	String act="Hi";   //match result
	String exp="Hi";   // o/p-> Pass
  Assert.assertEquals(act, exp);
}*/
 

//2] AssertNotEquals()
/*@Test
public void test()
{
	String act="Hi";  //result is not match
	String exp="Hii";  //o/p is pass
 Assert.assertNotEquals(act, exp,"Act & exp are matching");
}*/

	
//3] Assert True() Method
	/*@Test
	public void test()
	{
		String act="Hi";  //result is match 
		String exp="Hi";  //o/p is pass
	boolean actresult=true;
	Assert.assertTrue(actresult,"Result is not true");
	}*/
	
	
	//4]Assert False() Method
	/*@Test
	public void test()    // result is true
	{                      // o/p is false
		boolean result=true;
		Assert.assertFalse(result,"Result is not false");
	}*/
	
	//5]Assert_Null() Method
	/*@Test
	public void test()    // it is null
	{                     //o/p is pass
	String act=null;
	Assert.assertNull(act,"Act is not empty");
	}*/
	

	//6]Assert_Not_Null() Method
		/*@Test
		public void test()    // it is null
		{                     //o/p is Fail
		String act=null;
		Assert.assertNotNull(act,"Act is empty");
		}*/
	
	//7] AssertFail()Method
	
	@Test
	public void test()
	{
		String act="Hi";   // o/p is fail
		String exp="Hi";
		
		Assert.fail("Not in Scope");
		Assert.assertEquals(act, exp,"Act & Exp are not matching");
		
	}

	@Test
	public void test1()
	{
		String act="Hi";
		Assert.assertNotNull(act,"Act is empty");
	}
	
}


