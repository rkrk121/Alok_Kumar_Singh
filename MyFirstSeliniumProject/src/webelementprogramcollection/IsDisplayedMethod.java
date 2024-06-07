package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement hiddenElement=driver.findElement(By.name("preferred_pronoun"));
		
		if(hiddenElement.isDisplayed())
		{
			System.out.println("Fail:The hidden element is displayed!");
		}
		else
		{
		System.out.println("Pass:The hidden element is not displayed before!");
		}
		driver.manage().window().minimize();
		driver.quit();
		// Hidden element kya hai yaha par??

	}

}
