package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableLoginButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton=driver.findElement(By.name("login"));
		if(loginButton.isEnabled())
		{
			Thread.sleep(2000);
			loginButton.click();
			
		}
		else
		{
			System.out.println("Login button is not enable!");
		}
		driver.manage().window().maximize();
		driver.quit();

	}

}
