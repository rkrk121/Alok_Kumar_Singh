package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleOneWindow 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String wid=driver.getWindowHandle();
		System.out.println("wid=" +wid);
	}

}
// Script for HandleOneWindow 
