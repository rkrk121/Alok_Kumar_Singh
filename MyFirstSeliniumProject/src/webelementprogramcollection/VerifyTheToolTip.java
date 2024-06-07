package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTheToolTip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement flipkartLogo=driver.findElement(By.xpath("//a[@aria-label='Flipkart']//img"));
		String flipkartLogoToolTip=flipkartLogo.getAttribute("title");
		System.out.println("flipkartLogoToolTip=" + flipkartLogoToolTip);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.quit();

	}

}
