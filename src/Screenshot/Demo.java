package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo {

	public static void main(String[] args) throws IOException  
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
         
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://kite.zerodha.com/");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
       // path folder file 
       // name of the path
     
     File dest = new File("C:\\Users\\lenovo\\Desktop\\adc.jpg");       
      
        
        FileHandler.copy(source, dest);
	}

}
