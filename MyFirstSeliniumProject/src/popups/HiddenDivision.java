package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivision 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.ajio.com/");
		driver.get("https://www.flipkart.com/");
//		Actions actions= new Actions(driver);
//		actions.click().perform();
		driver.findElement(By.id("closeBtn")).click();

	}

}
