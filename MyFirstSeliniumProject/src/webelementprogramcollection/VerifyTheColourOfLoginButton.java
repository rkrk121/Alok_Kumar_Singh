package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColourOfLoginButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();//(8, 102, 255, 1)
		//WebDriver driver=new EdgeDriver();//(8, 102, 255, 1)
		//WebDriver driver=new FirefoxDriver();//(8, 102, 255)
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton=driver.findElement(By.name("login"));
		String backgroundColourOfLoginButton=loginButton.getCssValue("background-color");
		System.out.println("backgroundColourOfLoginButton=" + backgroundColourOfLoginButton);
		
		String convertedValue = Color.fromString(backgroundColourOfLoginButton).asHex();
		System.out.println("convertedValue=" + convertedValue);
		Thread.sleep(4000);
		driver.quit();
	}

}
