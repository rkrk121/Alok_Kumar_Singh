package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnTheFirstCryLogo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(2000);
		WebElement ClickOnTheFirstCryLogo=driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[1]/a/img"));
		
		Thread.sleep(2000);
		
		ClickOnTheFirstCryLogo.click();

	}

}
