package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"\"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		driver.manage().window().maximize();
			
			driver.get("https://www.Flipkart.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[contains(@class,'2KpZ6l ')])[1]")).click();
			
			
			
		}
	

}
