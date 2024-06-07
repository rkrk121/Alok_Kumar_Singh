package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.wikipedia.org/");
		driver.switchTo().activeElement().sendKeys("India");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		//org.openqa.selenium.javascriptException:
		//jse.executeScript("window.scrollBy(0,9000)");
		
		long heightOfTheWebpage=(long)jse.executeScript("return document.body.scrollHeight");
		System.out.println(heightOfTheWebpage);
         // go to page->inspect->console->execute.

	}

}
