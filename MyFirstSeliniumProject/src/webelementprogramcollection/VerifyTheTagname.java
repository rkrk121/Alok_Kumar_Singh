package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagname 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextFild=driver.findElement(By.id("email"));
		String emailTagName=emailTextFild.getTagName();
		System.out.println("emailTagName="+ emailTagName);
		
		if(emailTagName.equals("input"))
		{
		emailTextFild.sendKeys("alok@1234");
		}
		else
		{
		System.out.println("Email text field is not made up with tag name like <input>");
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
