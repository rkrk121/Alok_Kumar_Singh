package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/alok0/OneDrive/Desktop/alart.html");
		Thread.sleep(2000);
		String alertmsg =driver.switchTo().alert().getText();
		System.out.println("alertmsg:" + alertmsg);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
