package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)");
		
	   driver.get("https://the-internet.herokuapp.com/nested_frames");
	   
	   driver.switchTo().frame("frame-top");
	   
	   
	      Thread.sleep(1000);
	   
	       driver.switchTo().frame("frame-middle");
	          Thread.sleep(1000);
	          String middle = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	          
	          System.out.println(middle);
	          Thread.sleep(1000);
	          
	     
	     driver.switchTo().frame("frame-bottom");
	     
	     String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
	 
	     System.out.println(bottom);
			
	          
	          
	}

}
