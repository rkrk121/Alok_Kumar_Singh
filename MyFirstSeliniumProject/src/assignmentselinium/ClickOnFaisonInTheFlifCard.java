package assignmentselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnFaisonInTheFlifCard 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement faisonLogo=driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/img"));
		
		//Actions action =new Actions(driver);
		//action.moveToElement(faisonLogo).perform();
		
       	faisonLogo.click();
		
	}

}
