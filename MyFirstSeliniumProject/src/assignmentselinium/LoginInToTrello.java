package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInToTrello
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/en/login");
		Thread.sleep(2000);
		WebElement emailTextFild= driver.findElement(By.id("user"));
		emailTextFild.sendKeys("alokabc@123");
		Thread.sleep(2000);
		WebElement clickOnContinueButton=driver.findElement(By.id("login"));
		clickOnContinueButton.click();
		
		

	}

}
