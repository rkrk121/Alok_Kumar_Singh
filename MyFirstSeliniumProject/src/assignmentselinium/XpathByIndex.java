package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		WebElement serialName=driver.findElement(By.xpath("(//a[contains(text(),'Kesar Enterprise')]/../..//td)[4]"));
		
		Thread.sleep(2000);
		serialName.click();
		
	}

}
