package webdriver11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods11
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
					
				
			WebDriver driver=new ChromeDriver();
			
			System.out.println("Methods of web Driver");
			
  
			
		//1  Get 		
				
    driver.get("https://paytm.com/");		
	
	     Thread.sleep(1000);

	   // 2 close

   	driver.close();
			
			
	}
		
	
	}
	
}

