package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2_Alert {
	
	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"\"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
		driver.manage().window().maximize();
			
driver.get("https://demoqa.com/alerts");
		
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		
		String text = alt.getText();
		
		System.out.println(text);
		Thread.sleep(2000);
		alt.dismiss();
	
		
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		
		
	}

}