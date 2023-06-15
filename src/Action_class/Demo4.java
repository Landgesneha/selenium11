package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rclick).perform();
		
		//act.moveToElement(click).doubleClick().perform();
		
		
		
		
	}
	
}
