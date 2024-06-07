package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfLinkText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement forgotPasswardLink=driver.findElement(By.linkText("Forgotten password?"));
		WebElement forgotPasswardLink=driver.findElement(By.partialLinkText("Forgotten password"));
		Thread.sleep(2000);
		forgotPasswardLink.click();
	}

}
