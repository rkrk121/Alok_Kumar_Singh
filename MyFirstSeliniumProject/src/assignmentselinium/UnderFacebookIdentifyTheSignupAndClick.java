package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderFacebookIdentifyTheSignupAndClick 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement identifyTheSignUpButton=driver.findElement(By.name("websubmit"));
		Thread.sleep(2000);
		identifyTheSignUpButton.click();
		

	}

}
