package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
public class Web_Dreiver 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
       //1.Get
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	//4.Get Title
    String title=driver.getTitle();
    System.out.println("title of webpage is---->"+title);
    String title1="Facebook � log in or sign up";

    
     //5.Get Current Title
    String Actualurl=driver.getCurrentUrl();
    String Expurl="";
    
    //6.Maximize
    driver.manage().window().maximize();
    Thread.sleep(2000);
    //7.Navigate
    
    driver.navigate().to("https://www.facebook.com/");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    
    //8.size

    Dimension d=new Dimension(200,400);
    driver.manage().window().setSize(d);
    
    //9.position
    
    Point p=new Point(1000, 1000);
    driver.manage().window().setPosition(p);

    
  Thread.sleep(2000);
    //2.close
driver.close();	
    //3.Quite
  driver.quit();

   
}
}
