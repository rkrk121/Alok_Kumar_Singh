package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfEnum 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement useNameTextFild=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		useNameTextFild.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		useNameTextFild.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		useNameTextFild.sendKeys(Keys.chord("ADMIN"));
		Thread.sleep(2000);
		
		WebElement passwordTextFild=driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTextFild.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		passwordTextFild.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		passwordTextFild.sendKeys(Keys.chord("ADMIN"));
		Thread.sleep(2000);
		WebElement signInButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
		Thread.sleep(2000);
		
		signInButton.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();

	}

}
