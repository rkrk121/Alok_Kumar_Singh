package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheSizeAndPositionOfTheWindow 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// parent
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup");//child
		Set<String> allWids =driver.getWindowHandles();
		for(String wid: allWids)
		{
			String widUrl=driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widUrl);
			if(widUrl.equals("https://www.facebook.com/"))
{
}
			else if (widUrl.equals("https://www.facebook.com/signup"))
			{
				int childWidHeight=driver.manage().window().getSize().getHeight();
				System.out.println("childWidHeight=" +childWidHeight);
				int childWidth=driver.manage().window().getSize().getWidth();
				System.out.println("childWidth=" + childWidth);
				int childWidXaxis=driver.manage().window().getPosition().getX();
				System.out.println("childWidXaxis="+childWidXaxis);
				int childWidYaxis=driver.manage().window().getPosition().getY();
				System.out.println("childWidYaxis="+childWidYaxis);
				
				//Set the size and position
				
				Dimension definedSize=new Dimension(400,600);
				driver.manage().window().setSize(definedSize);
				}
		}
		

	}

}
//Script for CaptureTheSizeAndPositionOfTheWindow