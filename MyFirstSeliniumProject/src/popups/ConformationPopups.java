package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationPopups 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/alok0/OneDrive/Desktop/confirm.html");
		Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
