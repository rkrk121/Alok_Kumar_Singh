package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPostConditions
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

}
// Script for precondition and post condition