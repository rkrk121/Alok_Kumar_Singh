package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheEmptyPlaceHolder 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userNameTextFild=driver.findElement(By.id("username"));
		String userNameTextFildValue=userNameTextFild.getAttribute("value");
		
		System.out.println("userNameTextFildValue=" + userNameTextFildValue);
		
		if(userNameTextFildValue.isEmpty())
		{
			userNameTextFild.sendKeys("QSPIDER");
		}
		else
		{
			userNameTextFild.clear();
			Thread.sleep(2000);
			userNameTextFild.sendKeys("qspider");
			
			
			}
       }

}
