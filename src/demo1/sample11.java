package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11 {

	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		
	WebDriver driver=new ChromeDriver();
	
		
	driver.get("https://www.facebook.com/");	
		
	}
}
