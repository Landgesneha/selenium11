package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.get("https://kite.zerodha.com/");
        
        Demo a1=new Demo(driver);
        
        a1.enterUN();
        Thread.sleep(2000);
        
        a1.enterpass();
        Thread.sleep(2000);
        
        a1.button();
        Thread.sleep(2000);

	}

}
