package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColourOfCreateNewAccount 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createAccountLinks=driver.findElement(By.xpath("//a[text()='Create new account']"));
		String backgroundColourOfCreateLinkText=createAccountLinks.getCssValue("background-color");
		System.out.println("backgroundColourOfCreateLinkText=" + backgroundColourOfCreateLinkText);
		String converterValue= Color.fromString(backgroundColourOfCreateLinkText).asHex();
		System.out.println("converterValue=" + converterValue);
		
		String fontFamily=createAccountLinks.getCssValue("font-family");
		System.out.println("fontFamily=" + fontFamily);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
