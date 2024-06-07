package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextFild=driver.findElement(By.id("email"));
		int emailStartX=emailTextFild.getLocation().getX();
		System.out.println("emailStartX=" + emailStartX);
		WebElement passwordTextFild=driver.findElement(By.id("passContainer"));
		int passwordStartX=passwordTextFild.getLocation().getX();
		System.out.println("passwordStartX=" +passwordStartX);
		
		if(emailStartX==passwordStartX)
		{
			System.out.println("Pass:Email and password left alignment is verifide and it is correct!");
		}
		else
		{
			System.out.println("Fail:Email and password left alignment is verifide and it is Incorrect!");	
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
