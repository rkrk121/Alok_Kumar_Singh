package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheEmptyPlaceHolderInFacebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstNameTextFild=driver.findElement(By.name("firstname"));
		String firstNameTextFildValue=firstNameTextFild.getAttribute("aria-required");
		
		System.out.println("firstNameTextFildValue=" + firstNameTextFildValue);
	
		if(firstNameTextFildValue.isEmpty())
		{
			firstNameTextFild.sendKeys("alok kumar singh");
		}
		else 
		{

			firstNameTextFild.clear();
			Thread.sleep(2000);
			firstNameTextFild.sendKeys("ALOK KUMAR SINGH");
		}
		
		
		}

}
