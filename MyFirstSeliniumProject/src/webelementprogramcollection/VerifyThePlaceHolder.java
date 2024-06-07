package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyThePlaceHolder 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailTextFild=driver.findElement(By.id("email"));
		Thread.sleep(2000);
		String emailPlaceHolder=emailTextFild.getAttribute("placeholder");
		Thread.sleep(2000);
		System.out.println("emailPlaceHolder=" + emailPlaceHolder);
		
	}

}
