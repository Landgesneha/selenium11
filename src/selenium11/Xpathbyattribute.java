package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://kite.zerodha.com/");
        Thread.sleep(1000);
        
       WebElement UN = driver.findElement(By.xpath("//input[@id='userid']"));
       UN.sendKeys("Sneha");
       
       WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
       pass.sendKeys("Landge");
	}

}
