package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderShopGlobleIdentifySigninButtonAndClick
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement signUpButton =driver.findElement(By.cssSelector("button[type='submit']"));
		Thread.sleep(2000);
		signUpButton.click();

	}

}
