package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedForCheckBox 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/toysclp-store?otracker=nmenu_sub-baby%20%26%20kids_0_Toys");
		WebElement checkBoxBarbie=driver.findElement(By.xpath("//div[text()='BARBIE']/..//div[@class='_24_Dny']"));
		if(checkBoxBarbie.isSelected())
		{
			System.out.println("Req:Fail......The barbie checkbox is already in selected state!");
		}
		else
		{
			System.out.println("Req:Pass......The barbie checkbox is not in selected state!");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
