package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataByUsingEnum 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement userNameTextFild=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		userNameTextFild.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		userNameTextFild.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		userNameTextFild.sendKeys(Keys.chord("QSPIDER"));

	}

}

