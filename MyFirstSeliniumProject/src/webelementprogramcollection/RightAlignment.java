package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Email
		WebElement email=driver.findElement(By.id("email"));
		int emailXaxis=email.getRect().getX();
		int emailWidth=email.getRect().getWidth();
		int emailEndPiont=emailXaxis+emailWidth;
		System.out.println("emailEndPiont=" +emailEndPiont);
		//Password
		WebElement passwordTextFild=driver.findElement(By.id("passContainer"));
		int passwordXaxis=passwordTextFild.getRect().getX();
		int passwordWidth=passwordTextFild.getRect().getWidth();
		int passwordEntPoint=passwordXaxis+passwordWidth;
		System.out.println("passwordEntPoint=" +passwordEntPoint);
		if(emailEndPiont==passwordEntPoint)
		{
			System.out.println("Pass:Email and password text fild right alignment is verifide and found correct!");
		}
			else
			{
			System.out.println("Fail:Email and password text fild right alignment is verifide and found Incorrect!");
			
			}
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		}

	}


