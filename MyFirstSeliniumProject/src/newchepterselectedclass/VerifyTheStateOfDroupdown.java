package newchepterselectedclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyTheStateOfDroupdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement monthDroupDown=driver.findElement(By.id("month"));
		Thread.sleep(2000);
		Select monthSelect= new Select(monthDroupDown);
		
		if(monthSelect.isMultiple())
		{
			System.out.println("This is a multiple select droupdown!");
			Thread.sleep(4000);
		}
		
		else
		{
			monthSelect.selectByVisibleText("Dec");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
