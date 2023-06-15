package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Locators 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("file:///C:/Users/lenovo/Desktop/html/assignment2.html");
		driver.findElement(By.tagName("input")).sendKeys("Sneha");
		driver.findElement(By.name("selenium")).sendKeys("Sneha@1234");
		driver.findElement(By.id("12345")).sendKeys("abc@123");
		driver.findElement(By.id("1234567890")).sendKeys("1234567890");
	
}
}