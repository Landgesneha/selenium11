package List_box;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {


	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");

       driver.get("https://www.facebook.com/");
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().window().maximize();
        
       driver.findElement(By.linkText("Create new account")).click();
       
                              
       WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
       Select S1=new Select(day);
       S1.selectByValue("15");
       
       WebElement month= driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
       Select S2=new Select(month);
       S2.selectByValue("8");
       
       
       
     WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
      Select S3= new Select(year);
      S3.selectByValue("1947");
       
       List<WebElement>option=S3.getOptions();
       int Size=option.size();
       System.out.println("Size");
       
       S3.selectByValue("1994");
       
	}

}
