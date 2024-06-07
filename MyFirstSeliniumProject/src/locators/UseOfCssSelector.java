package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfCssSelector 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailOrPhoneTextFild=driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		emailOrPhoneTextFild.sendKeys("alok03951@gmail.com");
		Thread.sleep(2000);
		WebElement PassWordTextFild=driver.findElement(By.id("pass"));
		PassWordTextFild.sendKeys("9939846401");
		
		Thread.sleep(2000);
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		
		
		
		
		

	}

}
