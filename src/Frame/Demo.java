package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{

		 WebDriver driver=new ChromeDriver();
			
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)");
			
		   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		   
		   
		   driver.switchTo().frame("iframeResult");
		   
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time')]")).click();

	}

}
