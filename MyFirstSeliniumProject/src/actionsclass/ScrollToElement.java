package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cowin.gov.in/");
		WebElement searchButton=driver.findElement(By.xpath("//button[.='Search']"));
		Actions action=new Actions(driver);
		action.scrollToElement(searchButton).pause(2000).click(searchButton).perform();

	}

}
