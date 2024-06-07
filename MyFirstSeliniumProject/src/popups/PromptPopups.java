package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopups 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/alok0/OneDrive/Desktop/prompt.html");
		Thread.sleep(2000);
	    driver.switchTo().alert().sendKeys("51");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
