package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough 
{
	public void m1()
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"\"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
				
				
				
				driver.get("https://www.facebook.com/");
	}			
}
