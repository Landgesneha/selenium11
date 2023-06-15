package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_verfication 
{
@Test
public void test()
{
	String act="hi";
	String exp="hii";
	String exp1="hii";
	boolean result=false;
	
	SoftAssert Soft=new SoftAssert();
	
	Soft.assertEquals(act, exp,"exp are not matching");
	
	Reporter.log("Good morning",true);
	
	Soft.assertNotEquals(exp, exp1,"exp & exp1 are matching");
	
	Soft.assertTrue(result,"getting false record");
	
	Soft.assertFalse(true,"Getting true record");
	
	Soft.assertNotNull(exp, "field is null");
	
	Soft.assertNull(exp,"field is null");
	
	
	
	//Soft.fail("fail");
	
	Soft.assertAll();
	
}
}
