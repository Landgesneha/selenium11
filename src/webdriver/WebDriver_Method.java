package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//1.Get
		driver.get("https://www.facebook.com/");
		
		//4.Get Tittle
		
		String title= driver.getTitle();
		System.out.println("Title of current web page is=>"+title);
		
		String title1="Facebook � log in or sign up";
		if(title.equals(title1))
		{
		System.out.println("Result is pass");
		}
		else
		{
			System.out.println("Test cases is fail");
			
		}
		
		//5.Get Current URL
		String ExpUrl1="https://www.facebook.com/ ";
		String Actualur1 =driver.getCurrentUrl();
		System.out.println("Actualur1");
		//if(ExpUrl.eqauls(Actualur1))
		{
			System.out.println("Test case is pass");
		}
		//else
		{
			System.out.println("Test case is fail");
			
		}
		
		//6. Maximize Browse
		driver.manage().window().maximize();
		
		
		//7. Navigate Method
		
		//driver.navigate().to("https://paytm.com/");		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		
		//8.Set size
		//Dimension D=new Dimension(100,100);
		//driver.manage().window().setSize(D);
		//Thread.sleep(1000);
		
		//9.set position
		//driver.manage().window().setPosition(P);
		
		
		
		
		
		
		
		
		
		//Thread.sleep(2000);
		    //2.close
		//driver.close();	
		    //3.Quite
		//driver.quit();

	}

}
