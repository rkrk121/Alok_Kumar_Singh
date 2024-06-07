package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMoveToElementOppositXofset 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.myntra.com/");
		WebElement men=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Men']"));
		WebElement women=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Women']"));
		WebElement kid=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Kids']"));
		WebElement homeAndLiving=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Home & Living']"));
		WebElement beauty=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Beauty']"));
		WebElement studio=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Studio']"));
		Actions action=new Actions(driver);
		action.moveToElement(beauty,0,0).pause(2000).moveToElement(beauty,-279,0).perform();
		

	}

}
