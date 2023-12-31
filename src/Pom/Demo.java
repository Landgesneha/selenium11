package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {

	// Step 1 DM globally Access level private
	
		//annotation 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//button[text()='Login ']") private WebElement btn ;
	
	
	//step 2
	
	public Demo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step 3
	
	public void enterUN()
	{
		UN.sendKeys("DF4359");
	}
    
	public void enterpass()
	{
		pass.sendKeys("India@1234");
	}
	
	
	public void button()
	{
		btn.click();
	}
}





