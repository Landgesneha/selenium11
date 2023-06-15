package selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

  
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(2000);
    
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//button[text()=' Login ']")).click();
     
     driver.findElement(By.xpath("//p[text()=' (6) Timesheets to Approve']]"));
     Thread.sleep(2000);
     
  
     
     
     
     
     
     
     
	}

}
