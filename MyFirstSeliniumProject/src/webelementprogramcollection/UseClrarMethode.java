package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseClrarMethode 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTextFild=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		userNameTextFild.clear();
		Thread.sleep(2000);
		userNameTextFild.sendKeys("ADMIN");
		Thread.sleep(2000);
		
		
		WebElement passwordTextFild=driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTextFild.clear();
		Thread.sleep(2000);
		passwordTextFild.sendKeys("ADMIN");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(7000);
		driver.quit();
	}

}
