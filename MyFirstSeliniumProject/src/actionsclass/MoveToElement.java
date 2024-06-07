package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement menLink=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Men']"));
		WebElement womenLink=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Women']"));
		WebElement kidLink=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Kids']"));
		WebElement homeAndLivingLink=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Home & Living']"));
		WebElement beautyLink=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Beauty']"));
		WebElement studioLink=driver.findElement(By.xpath("//div[@class='desktop-navLinks']//a[text()='Studio']"));
		Actions action=new Actions(driver);
		action.moveToElement(menLink).pause(2000).moveToElement(womenLink).pause(2000).moveToElement(kidLink).pause(2000).moveToElement(homeAndLivingLink).pause(2000).moveToElement(beautyLink).pause(2000).moveToElement(studioLink).perform();
		

	}

}
