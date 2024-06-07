package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUseOfSummitMethode 
{
	//java.lang.UnsupportedOperationException
	//
	//<button/input type="submit"/button">

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement registerButton=driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(2000);
		registerButton.submit();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
