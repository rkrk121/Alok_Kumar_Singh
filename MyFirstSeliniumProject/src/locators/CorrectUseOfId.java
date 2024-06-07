package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectUseOfId 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// No such element exception----sel----run----unchecked
		//Address is mismatch
		WebElement emailTextFild=driver.findElement(By.id("email"));
		emailTextFild.sendKeys("alok@gmail.com");

	}

}
