package assignmentselinium;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeliniumAssignment
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//1st window
		    String expectedFirstWindowUrl=driver.getCurrentUrl();
		    
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/?hl=en");   //2nd window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html"); //3rd window
		String expectedThirdUrl=driver.getCurrentUrl();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.isro.gov.in/");          //4th window
		    String expectedFourthWindowURl=driver.getCurrentUrl();
		         
		         
		         
		         
		  Set<String> allWindowId=driver.getWindowHandles();
		     System.out.println(allWindowId.size());//4
		  
		  
		   for(String wid:allWindowId)  
		   {
			   
			      driver.switchTo().window(wid);
			       String actualUrl= driver.getCurrentUrl();
			       
			       if(actualUrl.equals(expectedThirdUrl)) 
			       {
			    	   System.out.println(driver.getTitle());
			    
			       }
			       else if(actualUrl.equals(expectedFirstWindowUrl)) 
			       {
			    	   System.out.println(driver.getCurrentUrl());
			       }
			       else if(actualUrl.equals(expectedFourthWindowURl))
			       {
			    	     int widthOfWindow= driver.manage().window().getSize().getWidth();
			    	     int heightOfWindow= driver.manage().window().getSize().getHeight();

			    	     System.out.println(widthOfWindow);
			    	     System.out.println(heightOfWindow);

			    	        int windowPOsitionFromXaxis = driver.manage().window().getPosition().getX();
			    	        int windowPOsitionFromYaxis = driver.manage().window().getPosition().getY();
			    	        System.out.println(windowPOsitionFromXaxis);
			    	        System.out.println(windowPOsitionFromYaxis);
			    	        Dimension dimension =new Dimension(500,500);
			    	        driver.manage().window().setSize(dimension);
			    	        Point point =new Point(80,120);
			    	        driver.manage().window().setPosition(point);
			    	        
			    	        //driver.close();


			       }
			   
		   }
		 //  driver.quit();

	}

}
