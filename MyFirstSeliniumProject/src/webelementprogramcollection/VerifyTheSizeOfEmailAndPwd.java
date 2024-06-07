package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheSizeOfEmailAndPwd 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextFild=driver.findElement(By.id("email"));
		int emailHight=emailTextFild.getSize().getHeight();
		System.out.println("emailHight=" + emailHight);
		int emailWidth=emailTextFild.getSize().getWidth();
		System.out.println("emailWidth=" + emailWidth);
		WebElement passwordTextFild=driver.findElement(By.id("passContainer"));
		int passwordHight=passwordTextFild.getSize().getHeight();
		System.out.println("passwordHight=" + passwordHight);
		int passwordWidth=passwordTextFild.getSize().getWidth();
		System.out.println("passwordWidth=" + passwordWidth);
		
		if((emailHight==passwordHight)&& (emailWidth==passwordWidth))
		{
			System.out.println("Pass:Email and password fild size is verifide and it is correct");
		}
		else
		{
		System.out.println("Fail:Email and password fild size is verifide and it is incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
		}
	}


