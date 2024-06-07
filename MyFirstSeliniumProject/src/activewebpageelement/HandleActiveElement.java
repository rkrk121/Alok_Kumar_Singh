package activewebpageelement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleActiveElement 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Hello Bangalore");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("ALOK KUMAR SINGH");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
