package Autosuggetion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"\"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		
      //		driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			driver.get("https://www.google.com/");
			
			
			
			driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("oneplus");
			
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
			
			// OnePlus 10R 5G  wM6W7d
			
			
			String exp="Apple iPhone 13";
			
			for(WebElement opt:list)
			{
				
				String act = opt.getText();
				
				System.out.println(act);
				
				
				if(act.matches(exp))
				{
					
					opt.click();
					break;
					
				}
				

				
			}
			

			
			
			
		}



}
