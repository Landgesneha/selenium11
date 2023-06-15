package Popup;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class HomeworkAutomatePage {

		public static void main(String[] args) throws InterruptedException, IOException 
		{
		
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",
					"\"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			driver.get("https://skpatro.github.io/demo/links/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();  //1
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();  //2
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();  //3 
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();  //4
			
			
			Thread.sleep(2000);
			
			
			Set<String> ids = driver.getWindowHandles();
			
			
			ArrayList<String> ar=new ArrayList<String>(ids);
			
			
			System.out.println(ar.size());
			
			
			for(String opt:ar)
			{
				System.out.println(opt);
			}
			
		
			driver.switchTo().window(ar.get(3));
			
			driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
			
			
			Thread.sleep(3000);
			
			driver.switchTo().window(ar.get(2));
			
			WebElement a = driver.findElement(By.xpath("(//span[text()='Training'])[1]"));
			
			System.out.println(a.getText());
			
			Thread.sleep(3000);
			
			driver.switchTo().window(ar.get(4));
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        String random = RandomString.make(2);
	        
		
			File dest =new File("C:\\Users\\lenovo\\Desktop\\HW"+random+".jpg");
		
			
			FileHandler.copy(source, dest);
			
			
			Thread.sleep(3000);
			
			driver.switchTo().window(ar.get(1));
			
			driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

	}

}
