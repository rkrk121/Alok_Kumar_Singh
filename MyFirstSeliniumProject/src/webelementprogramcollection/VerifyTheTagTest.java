package webelementprogramcollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgottenPasswordLink=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate')]"));
        String forgottenPasswordTagText= forgottenPasswordLink.getText();
        System.out.println("forgottenPasswordTagText=" + forgottenPasswordTagText);
        
        if (forgottenPasswordTagText.equals("Forgotten password?"))
        		{
        	System.out.println("Forgot text is correct!");
        		}
        else
        {
        	System.out.println("Forgot text is Incorrect!");
        }
        driver.manage().window().minimize();
        driver.quit();
        
	}

}
