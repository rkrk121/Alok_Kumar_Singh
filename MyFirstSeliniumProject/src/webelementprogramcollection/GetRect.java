package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/signup");
//		WebElement firstNameTextFild=driver.findElement(By.name("firstname"));
//		String valueOfFirstNameTextFild=firstNameTextFild.getAttribute("value");
		driver.get("http://demo.vtiger.com/vtigercrm/");
		WebElement userNameTextFild=driver.findElement(By.id("username"));
		String valueOfUsernameTextfild=userNameTextFild.getAttribute("value");
		System.out.println("valueOfUsernameTextfild=" + valueOfUsernameTextfild);
		
		if(valueOfUsernameTextfild.isEmpty())
		{
			Thread.sleep(2000);
			userNameTextFild.sendKeys("alok singh");
			}
		else
		{
			Thread.sleep(2000);
			userNameTextFild.clear();
			Thread.sleep(2000);
			userNameTextFild.sendKeys("ALOK SINGH");
		}

	}

}
