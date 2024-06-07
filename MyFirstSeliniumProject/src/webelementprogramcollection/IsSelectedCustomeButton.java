package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCustomeButton 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement customRadioButton=driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
		if(customRadioButton.isSelected())
		{
			System.out.println("Fail: Custome radio button is already selected!");
		}
		else
		{
		System.out.println("Pass: Custome radio button is not selected!");
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
