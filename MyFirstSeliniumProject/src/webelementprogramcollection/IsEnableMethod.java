package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/home/cowin_signup_form");
		Thread.sleep(2000);
		WebElement submitBotton=driver.findElement(By.xpath("//button[@class=' btn btn-info submitbutton']"));
		if(submitBotton.isEnabled())
		{
			submitBotton.click();
		}
		else
		{
			driver.findElement(By.xpath("//button[text()='Accept Terms of service'")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("confbtn")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			Thread.sleep(2000);
			submitBotton.click();
			System.out.println("IsNotEnabled");
		}
		driver.manage().window().maximize();
		driver.quit();
			
		}

	}


