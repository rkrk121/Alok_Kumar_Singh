package webelementprogramcollection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource 
{

	public static void main(String[] args) throws InterruptedException 
	{

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://digitalagrocorps.in/");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//font[.='Karnataka']")).click();
       
       
      String pageSource = driver.getPageSource();
     // System.out.println(pageSource);
      
      if(pageSource.contains("Application Begin: : 01-02-2024"))
      {
    	  System.out.println("Application begining date has been announced!");
    	  
    	  if(pageSource.contains("Last date for submission of online application is 15-05-2024"))
    	  {
    		  System.out.println("Last date for submission has been announced!"); 
    	  }
    	  else
    	  {
    		  System.out.println("Last date for submission has not been announced!"); 
    	  }
      }
      else
      {
    	  System.out.println("Application begining date has not been announced!");
      }
      driver.manage().window().minimize();
      driver.quit();
      
       

	}

}
