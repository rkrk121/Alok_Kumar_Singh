package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithMultipleWindows 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    Thread.sleep(3000);
	    driver.get("https://www.myntra.com/");
	    Set<String> allWids=driver.getWindowHandles();
	    System.out.println(allWids.size());
	    

	}

}
// Script for PlayWithMultipleWindows 
