
package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.flipkart.com/");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       // driver.manage().window().maximize();
        
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String random = RandomString.make(2);
        
        File dest = new File("C:\\Users\\lenovo\\Desktop\\flipkart"+random+".jpg");
        
        FileHandler.copy(source, dest);

	}

}
