package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinktextAttribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/home/cowin_signup_form");
		
		WebElement acceptTermsAndConditionButton=driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
		Thread.sleep(2000);
		acceptTermsAndConditionButton.click();
		//driver.manage().window().minimize();
		//driver.quit();
		

	}

}
